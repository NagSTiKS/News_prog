package com.example.myapplication1;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;




public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    TextView textObject;
    Button buttonBack;
    Button buttonNext;
    Button buttonHome;
    ImageView print;
    int chet=0;
    int []max_renge_mas= new int [6];
    //int choseNN= getIntent().getIntExtra("chosend",0);
    String [][] texts= new String[6][6];
    int [][]drawsArray= new int [6][6];


    int chosen;
    int chos_red;
    String dop_txt;


    Drawable d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        textObject = findViewById(R.id.info);
        buttonBack = findViewById(R.id.button9);
        buttonNext = findViewById(R.id.button10);
        buttonHome = findViewById(R.id.button11);
        print = findViewById(R.id.Print);

        //textObject.setText("good evening");

        buttonBack.setOnClickListener(this);
        buttonNext.setOnClickListener(this);
        buttonHome.setOnClickListener(this);

        texts[0][0]="В понедельник в Беларуси ожидаются грозы с сильными порывами ветра. При этом будет тепло, в некоторых регионах температура поднимется до + 21 °C. Об этом сообщает Белгидромет Минприроды.";
        texts[0][1]="Сегодня, 2 мая, в период до 22 часов по юго-востоку республики ожидаются грозы, местами сильные ливни, град, шквалистое усиление ветра до 15−20 м/с, говорится в сообщении.";
        texts[0][2]="Прогноз Белгидромета на эти большие выходные просто отличный: тепло, солнечно и дождь только в последний день перед выходом на работу — в воскресенье. Жаль, что придется сидеть дома, врачи настоятельно это рекомендуют. Давайте будем благоразумны: шашлыки и другие поездки отложим до лучших времен.";
        texts[0][3]="Погода будет такой же странной, как очередная рабочая неделя для белорусов: в режиме «все успеть». Нас ждет и резкое похолодание — правда, на один день, — и такое же резкое потепление, а еще порывистый ветер и гроза. По предварительным данным pogoda.by, в выходные также будет дождливо, но тепло.";
        texts[0][4]="Утром в Минске температура воздуха +10 °C. Ветер С — 0−2 м/с. Влажность составит 95%, давление — 756 мм рт. ст.\n" +
                "Днем температура воздуха +17 °C. Ветер СЗ — 2−4 м/с. Влажность составит 50%, давление — 757 мм рт. ст.\n" +
                "Вечером температура воздуха +13 °C. Ветер СЗ — 2−4 м/с. Влажность составит 85%, давление — 758 мм рт. ст.";

        texts[1][0]="Француженка Селия Эмонье — бронзовый призер чемпионата мира по биатлону в эстафете. Она стабильно попадала в заявку французской сборной на этапы Кубка мира и была надежным бойцом командных гонок. Но в 28 лет Селия поняла, что биатлона с нее достаточно.";
        texts[1][1]="Рампа для экстремальных видов спорта появилась на территории гродненской школы № 15. Там могут кататься не только скейтеры и велосипедисты, но и самокатеры или роллеры. Спонсорскую помощь для постройки оказала табачная фабрика, сообщает портал hrodna.life.";
        texts[1][2]="Вы же помните, как в Рупольдинге Анна Сола заставила белорусских болельщиков вспомнить, каково это — гордо радоваться биатлонным успехам и оставлять за спиной таких топов, как Фиалкова, Ройзеланд и Виттоцци? Этой белоруске всего 23. Но она уже успела стать чемпионкой мира среди юниоров, в отчаянии сказать биатлону «прощай», вернуться в спорт после уговоров тренеров и самого министра, окунуться в невероятную историю любви и удивить элиту Кубка мира.";
        texts[1][3]="Крупная ярмарка «Колядный кирмаш» будет работать с 14 декабря по 15 января возле Дворца спорта. Ее организатор — предприятие «Минсквнешторгинвест».\n" +
                "На ярмарке обещают установить 35 деревянных домиков для торговли новогодними украшениями, одеждой и едой. По словам организаторов, выбор блюд будет приличный — можно перекусить драниками, жареными улитками, купить бургеры и хот-доги, попробовать литовскую кухню, венгерские калачи, мясо в тандыре, а также выпить горячие напитки.";
        texts[1][4]="Участники чемпионата мира по водным видам спорта пострадали во время трагедии в корейском Кванджу, где обрушился внутренний балкон ночного клуба, сообщает «Р-Спорт».\n"+"Пострадали девять ватерполистов из США, Новой Зеландии, Италии, Бразилии и Нидерландов, получившие порезы и ушибы.\n" +
                "Погибло два местных жителя, не относящихся к чемпионату мира.\n" +
                "Капитан новозеландской мужской команды Мэтт Смолл сказал, что он почувствовал, как пол буквально провалился у него под ногами.";

        texts[2][0]="Последние звонки в школах в этом году пройдут 29 и 30 мая. Выпускные — 10 и 11 июня. Такие даты своим приказом определило Министерство образования.\n"+"Последний звонок для учащихся IX, XI классов столичных средних школ прозвенит 29 мая, для учащихся остальных регионов — 30 мая. Выпускные с вручением аттестатов — 10 или 11 июня.\n" +
                "В отдельных случаях выпускной вечер разрешено проводить «в учреждениях дополнительного образования детей и молодежи, учреждениях культуры».\n";
        texts[2][1]="Министерство образования определило, какие отметки будут неудовлетворительны по результатам централизованного тестирования в 2020 году. По предмету белорусский или русский язык неудовлетворительными будут считаться отметки от 0 до 9 баллов, для специальностей филологического профиля — от 0 до 24.По предмету профильного — математика, физика, химия, биология — отметки от 0 до 19 баллов. По истории Беларуси, всемирной истории, обществоведению, географии, иностранным языкам  — отметки от 0 до 24 баллов." ;
        texts[2][2]="В Министерстве образования обсуждают вопрос об отмене пороговых баллов на централизованном тестировании. Об этом накануне педагогической коллегии сообщил министр образования Игорь Карпенко.\n";
        texts[2][3]="Каждые три года Международная программа оценки студентов PISA проводит тестирование ключевых знаний и навыков 15-летних школьников. В 2018 году Беларусь впервые присоединилась к программе." +"Всего в исследовании PISA приняло участие 600 тысяч школьников из 79 стран и экономик мира. В 2018 году им предложили пройти 2-часовой тест. Главным предметом стало чтение — с добавлением математики, естественных наук и так называемых глобальных компетенций"
               + "Например, в 2003 и 2012 годах исследование фокусировалось на математике, в 2006-м и 2015-м — на естественных науках.\n";
        texts[2][4]="Министерство образования не продлило аккредитацию некоторых специальностей Минского инновационного университета. Более 1500 студентов опасаются, что могут остаться без дипломов. Министр образования Игорь Карпенко в комментарии TUT.BY заверил: волноваться не о чем, студенты смогут продолжить образование в других вузах.\n";

        texts[3][0]="Джеймс МакЭвой объединился с друзьями и коллегами и принял участие в создании «сериала в изоляции» — фантастического проекта «Звездная сила», пародии на «Звездный путь». МакЭвой сыграл капитана космического корабля, который пропал без вести. Он возвращается, нападая на членов своего экипажа. Вскоре выясняется, что этот капитан — клон, созданный злым ученым. Появляется настоящий капитан, клон сбегает, герои отправляются в погоню, а с капитаном связывается он сам из будущего. Все как полагается в подобным сериалах.";
        texts[3][1]="В беседе с Collider сценарист Акива Голдсман раскрыл детали несостоявшегося проекта «Бэтмен против Супермена», работа над которым велась в начале 2000-х. Режиссерское кресло картины о противостоянии главных героев DC занимал Вольфганг Петерсен, а главные роли должны были исполнить Колин Фаррелл и Джуд Лоу. По словам Голдсмана, они готовили очень мрачный фильм, где Альфред умирал в самом начале, а Джокер убивал жену Брюса Уэйна.";
        texts[3][2]="Художник Ник Мюррей Уиллис собрал в одном видео 100 знаменитых цитат из фильмов, которые он проиллюстрировал буквально или без контекста. Так, фраза Гендальфа «Ты не пройдешь!» звучит как на фоне неудачного теста по вождению, так и во время футбольного матча. Текст из «Джерри Магуайера» произносят два кусочка пазла, а вопрос Джокера «Чего такой серьезный?» задается с гвардейцу, охраняющему Букингемский дворец.";
        texts[3][3]="В конце апреля студенты школы каскадеров Campus Univers Cascades запустили челлендж #CUCchallenge. Каждый из них записал видео, в котором показал владение боевыми навыками, а затем все ролики смонтировали в один клип. Так участники решили бросить вызов коронавирусу. Недавно челлендж поддержала каскадер Зои Белл. Для ее ролика снялись известные актрисы, среди которых Марго Робби, Холли Берри и Скарлетт Йоханссон.";
        texts[3][4]="В интервью Collider продюсер Джерри Брукхаймер рассказал, что в разработке находятся два проекта, связанных с приключенческой картиной 2004 года «Сокровище нации». По словам продюсера, они работают над сериалом для стрим-сервиса Disney+ и третьим фильмом, в котором должны вернуться Николас Кейдж и основной актерский состав прошлых частей.";

        texts[4][0]="ЕС призывает страны блока открыть границы, чтобы спасти туристический сезон. В Еврокомиссии указывают, что снятие ограничений внутри блока должно быть постепенным. Тем не менее, спасение части летнего туристического сезона с сохранением безопасности для людей там считают вполне возможным.";
        texts[4][1]="Президент России Владимир Путин раскритиковал работу портала госуслуг, который должен принимать заявки на получение выплат на детей в возрасте от 3 до 16 лет, которые ранее анонсировал глава государства. Портал не справился с количеством обращений, которых, по словам главы правительства Михаила Мишустина, было более 2 млн.";
        texts[4][2]="На Украине продолжаются протесты из-за карантина. На этот раз свое возмущение высказали водители и перевозчики, устроив акцию протеста в центре Киева — по Крещатику от Европейской площади. Первые послабления в этой сфере в стране запланированы на 22 мая. Однако украинцы из-за убытков и падения доходов требуют более активного снятия карантина. Кроме перевозчиков, протесты проводили ранее деятели культуры и предприниматели.";
        texts[4][3]="The Times сообщает, что в китайских социальных сетях набирают обороты призывы к военному присоединению Тайваня. Китайская республика заявила о себе во время борьбы с пандемией — власти достаточно оперативно и эффективно смогли отреагировать на вспышку коронавируса. Очередные дискуссии о формах признания Тайваня поднялись в связи с тем, что правительство региона утверждает, что ВОЗ, из-за позиции Китая, игнорирует успехи республики в борьбе с заболеванием.";
        texts[4][4]="Великобритания затягивает процесс переговоров с Евросоюзом по Brexit, чтобы добиться наиболее выгодных условий дальнейшего взаимодействия, пишут европейские СМИ. Несмотря на пандемию коронавируса, Лондон поставил Брюссель в жесткие временные рамки и не собирается менять свою позицию. Однако переговоры находятся в тупике, что вызывает опасения завершения Brexit без сделки.";

        texts[5][0]="Компания AMC Networks приобрела права на экранизацию романов американской писательницы Энн Райс, входящих в серии «Вампирские хроники» и «Мэйфейрские ведьмы».Как отмечает Deadline, согласно условиям сделки, AMC Networks займётся разработкой фильмов и сериалов на основе произведений писательницы для собственных телесетей и стриминговых сервисов. Отмечается, что вся продукция в рамках соглашения будет создаваться при участии самой Энн Райс и её сына Кристофера Райса в качестве исполнительных продюсеров.";
        texts[5][1]="try toГлавный хранитель дома-музея А.П. Чехова в Ялте Владислав Кожин рассказал о первой онлайн-экскурсии по третьему этажу экспозиции, которая пройдёт в рамках акции «Ночь музеев».«Там находится комната сестры писателя и первого директора дома-музея Марии Павловны Чеховой. Недавно кадры из этой комнаты были продемонстрированы на виртуальной выставке «Остаюсь на посту», что вызвало большой интерес у наших гостей», — отметил он в беседе с «Крыминформ».";
        texts[5][2]="БДТ покажет трансляцию спектакля «Война и мир Толстого» режиссёра Виктора Рыжакова с народной артисткой СССР Алисой Фрейндлих в главной роли.";
        texts[5][3]="Новозеландский режиссёр Тайка Вайтити снимет новый полнометражный художественный фильм в рамках франшизы «Звёздные войны». Он же выступит одним из авторов сценария картины. По данным СМИ, лента, скорее всего, не имеет отношения к анонсированной ранее новой трилогии и станет отдельным проектом. За сценарий к последнему Вайтити получил «Оскар» и премию BAFTA. Однако у российского зрителя не было возможности оценить картину: компания Disney отказалась от проката провокационной чёрной комедии про Вторую мировую войну на территории страны.";
        texts[5][4]="Организаторы «Московских сезонов» подготовили к 9 мая праздничный онлайн-проект «Искусство Победы».«Спецпроект «Искусство Победы» посвящён счастливым событиям, которые пусть редко, но всё же случались даже в тяжёлые военные годы, и всем, кто дарил людям радость и праздник», — отметили в Оргкомитете цикла городских уличных мероприятий «Московские сезоны».";

        drawsArray[0][0]=R.drawable.pogoda1;
        drawsArray[0][1]=R.drawable.pogoda2;
        drawsArray[0][2]=R.drawable.pogoda3;
        drawsArray[0][3]=R.drawable.pogoda4;
        drawsArray[0][4]=R.drawable.pogoda5;
        drawsArray[0][5]=R.drawable.pogoda6;

        drawsArray[1][0]=R.drawable.sport1;
        drawsArray[1][1]=R.drawable.sport2;
        drawsArray[1][2]=R.drawable.sport3;
        drawsArray[1][3]=R.drawable.sport4;
        drawsArray[1][4]=R.drawable.sport5;
        drawsArray[1][5]=R.drawable.sport6;

        drawsArray[2][0]=R.drawable.obr1;
        drawsArray[2][1]=R.drawable.obr2;
        drawsArray[2][2]=R.drawable.obr3;
        drawsArray[2][3]=R.drawable.obr4;
        drawsArray[2][4]=R.drawable.obr5;
        drawsArray[2][5]=R.drawable.obr6;

        drawsArray[3][0]=R.drawable.kino1;
        drawsArray[3][1]=R.drawable.kino2;
        drawsArray[3][2]=R.drawable.kino3;
        drawsArray[3][3]=R.drawable.kino4;
        drawsArray[3][4]=R.drawable.kino5;
        drawsArray[3][5]=R.drawable.kino6;

        drawsArray[4][0]=R.drawable.pol1;
        drawsArray[4][1]=R.drawable.pol2;
        drawsArray[4][2]=R.drawable.pol3;
        drawsArray[4][3]=R.drawable.pol4;
        drawsArray[4][4]=R.drawable.pol5;
        drawsArray[4][5]=R.drawable.pol6;

        drawsArray[5][0]=R.drawable.isk_1;
        drawsArray[5][1]=R.drawable.isk_2;
        drawsArray[5][2]=R.drawable.isk_3;
        drawsArray[5][3]=R.drawable.isk_4;
        drawsArray[5][4]=R.drawable.isk_5;
        drawsArray[5][5]=R.drawable.isk_6;


        for (int i=0;i<6; i++)
            max_renge_mas[i]=5;

        chosen= getIntent().getIntExtra("chosend",0);
        chos_red= getIntent().getIntExtra("NP",0);
        dop_txt=getIntent().getStringExtra("TXT");

        if (chosen!=0) {
            chosen--;
        }
        else {
            chosen = chos_red;
            max_renge_mas[chosen]++;
            texts[chosen][5]=dop_txt;
            Toast.makeText(getApplicationContext(), "Добавленный тескт:" + dop_txt, Toast.LENGTH_LONG).show();
        }






        textObject.setText(texts[chosen][0]);
        d = getResources().getDrawable(drawsArray[chosen][0]);
        print.setImageDrawable(d);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        // i = new Intent(this, Main2Activity.class);
        //startActivity(i);


        switch (view.getId()) {

            case R.id.button11:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.button9:
                if(chet!=0) {
                    chet--;
                    textObject.setText(texts[chosen][chet]);
                    d = getResources().getDrawable(drawsArray[chosen][chet]);
                    print.setImageDrawable(d);
                }
                    else
                {
                    Toast.makeText(getApplicationContext(),"Sorry, end of list", Toast.LENGTH_LONG).show();
                    break;
                }
                break;
            case R.id.button10:
                if(chet!=max_renge_mas[chosen]-1) {
                    chet++;
                    textObject.setText(texts[chosen][chet]);
                    d = getResources().getDrawable(drawsArray[chosen][chet]);
                    print.setImageDrawable(d);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Sorry, end of list", Toast.LENGTH_LONG).show();
                    break;
                }
                break;


        }
    }
}