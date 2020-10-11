package ru.bkmz.etapTwo.DB.qust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/vertex";
    static final String USER = "root";
    static final String PASS = "root";
    static String[] name = "Абакум, Абрам, Абросим, Аввакум, Август, Авдей, Авдий, Авель, Авенир, Аверий, Аверкий, Аверьян, Авксентий, Авраам, Авраамий, Аврам, Аврамий, Аврелиан, Автоном, Агап, Агапий, Агапит, Агафангел, Агафон, Аггей, Адам, Адриан, Азар, Азарий, Акакий, Акила, Аким, Акиндин, Акинф, Акинфий, Аксён, Аксентий, Александр, Алексей, Алексий, Альберт, Альфред, Амвросий, Амос, Амфилохий, Ананий, Анастасий, Анатолий, Андрей, Андриан, Андрон, Андроний, Андроник, Анект, Анемподист, Аникей, Аникий, Аникита, Анисий, Анисим, Антиох, Антип, Антипа, Антипий, Антон, Антонин, Антроп, Антропий, Ануфрий, Аполлинарий, Аполлон, Аполлос, Ардалион, Ареф, Арефий, Арий, Аристарх, Аристид, Аркадий, Арнольд, Арон, Арсен, Арсений, Арсентий, Артамон, Артём, Артемий, Артур, Архип, Асаф, Асафий, Аскольд, Афанасий, Афиноген, Афинодор, Африкан, Бажен, Бенедикт, Богдан, Болеслав, Бонифат, Бонифатий, Борис, Борислав, Бронислав, Будимир, Вавила, Вадим, Валентин, Валериан, Валерий, Варлам, Варламий, Варнава, Варсоноф, Варсонофий, Варфоломей, Василий, Вассиан, Велизар, Велимир, Венедикт, Вениамин, Венцеслав, Викентий, Виктор, Викторий, Викул, Викула, Вилен, Виленин, Вильгельм, Виссарион, Вит, Виталий, Витовт, Витольд, Владилен, Владимир, Владислав, Владлен, Влас, Власий, Вонифат, Вонифатий, Всеволод, Всеслав, Вукол, Вышеслав, Вячеслав, Гавриил, Гаврил, Галактион, Гедеон, Гелимин, Геласий, Гелий, Геннадий, Генрих, Георгий, Герасим, Гервасий, Герман, Гермоген, Геронтий, Гиацинт, Глеб, Гораций, Горгоний, Гордей, Гостомысл, Гремислав, Григорий, Гурий, Гурьян, Давид, Давыд, Далмат, Даниил, Данил, Деодор, Дементий, Демид, Демьян, Денис, Денисий, Димитрий, Диомид, Дионисий, Дмитрий, Добромысл, Добрыня, Довмонт, Доминик, Донат, Доримедонт, Дормедонт, Дормидонт, Дорофей, Досифей, Евгений, Евграф, Евграфий, Евдоким, Евлампий, Евлогий, Евмен, Евмений, Евсей, Евстафий, Евстахий, Евстигней, Евстрат, Евстратий, Евтихий, Евфимий, Егор, Егорий, Елизар, Елисей, Елистрат, Елпидифор, Емельян, Епифан, Епифаний, Еремей, Ермий, Ермил, Ермила, Ермилий, Ермолай, Ерофей, Ефим, Ефимий, Ефрем, Ефремий, Захар, Захарий, Зенон, Зиновий, Зосим, Зосима, Иаким, Иакинф, Иван, Игнат, Игнатий, Игорь, Иероним, Измаил, Изосим, Изот, Изяслав, Илиодор, Илларион, Илья, Иннокентий, Иоанн, Иов, Иона, Иосафат, Иосиф, Ипат, Ипатий, Ипполит, Ираклий, Иринарх, Ириней, Иродион, Исаак, Исаакий, Исай, Исак, Исакий, Исидор, Иустин, Казимир, Каллимах, Каллиник, Каллиопий, Каллист, Каллистрат, Каллисфен, Калуф, Кандидий, Кантидиан, Капик, Капитон, Карион, Карл, Карп, Кастрихий, Касьян, Ким, Киприан, Кир, Кириак, Кирик, Кирилл, Кирсан, Клавдий, Клим, Климент, Климентий, Кондрат, Кондратий, Конон, Конрад, Константин, Корней, Корнелий, Корнил, Корнилий, Ксенофонт, Кузьма, Куприян, Лавр, Лаврентий, Ладимир, Лазарь, Ларион, Лев, Леон, Леонард, Леонид, Леонтий, Леопольд, Логвин, Логгин, Лонгин, Луарсаб, Лука, Лукан, Лукиан, Лукьян, Любим, Любомир, Любомысл, Люциан, Мавр, Маврикий, Мавродий, Май, Макар, Макарий, Македон, Македоний, Максим, Максимиан, Максимилиан, Малх, Мануил, Марат, Мардарий, Мариан, Марин, Марк, Маркел, Маркиан, Марлен, Мартимьян, Мартин, Мартиниан, Мартирий, Мартын, Мартьян, Матвей, Мелентий, Мелетий, Меркул, Меркурий, Мефодий, Мечислав, Милан, Милен, Милий, Мина, Минай, Мирон, Мирослав, Мисаил, Митрофан, Митрофаний, Михаил, Михей, Модест, Моисей, Мокей, Мокий, Мстислав, Назар, Назарий, Наркис, Натан, Наум, Нестер, Нестор, Нефёд, Никандр, Никанор, Никита, Никифор, Никодим, Николай, Никон, Нил, Нифонт, Олег, Олимпий, Онисим, Онисифор, Онуфрий, Орест, Осип, Оскар, Остап, Остромир, Павел, Павлин, Паисий, Палладий, Памфил, Памфилий, Панкрат, Панкратий, Пантелей, Пантелеймон, Панфил, Парамон, Пармен, Парфён, Парфений, Парфентий, Патрикей, Патрикий, Пафнутий, Пахом, Пахомий, Перфилий, Пётр, Пимен, Питирим, Платон, Полиевкт, Полиект, Поликарп, Поликарпий, Порфир, Порфирий, Потап, Потапий, Пров, Прокл, Прокоп, Прокопий, Прокофий, Протас, Протасий, Прохор, Радий, Радим, Радислав, Радован, Ратибор, Ратмир, Рафаил, Рем, Роберт, Родион, Роман, Ростислав, Рубен, Рувим, Рудольф, Руслан, Рюрик, Савва, Савватей, Савватий, Савёл, Савелий, Саверий, Савин, Савиниан, Сакердон, Салтам, Самойла, Самсон, Самсоний, Самуил, Светозар, Свирид, Святополк, Святослав, Себастьян, Севастьян, Северин, Северьян, Селиван, Селивёрст, Селифан, Семён, Семион, Серапион, Серафим, Сергей, Сигизмунд, Сидор, Сила, Силан, Силантий, Силуян, Сильван, Сильвестр, Симеон, Симон, Смарагд, Созон, Созонт, Созонтий, Сократ, Соломон, Сосипатр, Софон, Софоний, Софрон, Софроний, Спартак, Спиридон, Спиридоний, Станимир, Станислав, Стахий, Степан, Стоян, Стратоник, Сысой, Тарас, Твердислав, Творимир, Терентий, Тертий, Тигран, Тигрий, Тимофей, Тимур, Тит, Тихон, Тристан, Трифилий, Трифон, Трофим, Увар, Ульян, Устин, Фабиан, Фадей, Фалалей, Фатьян, Фёдор, Федос, Федосей, Федосий, Федот, Федотий, Федул, Феликс, Фемистокл, Феогност, Феоктист, Феопемпт, Феофан, Феофил, Феофилакт, Ферапонт, Филарет, Филат, Филимон, Филипий, Филипп, Филофей, Фирс, Флегонт, Флорентий, Флорентин, Флориан, Фока, Фома, Фортунат, Фотий, Фридрих, Фрол, Харитон, Харитоний, Харлам, Харламп, Харлампий, Хрисанф, Христофор, Эдуард, Эмилий, Эмиль, Эммануил, Эразм, Эраст, Эрнест, Эрнст, Ювеналий, Юлиан, Юлий, Юрий, Юстин, Яким, Яков, Якуб, Ян, Януарий, Ярополк, Ярослав, ЕНСКИЕ, Августа, Августина, Авдотья, Аврелия, Аврея, Аврора, Агапа, Агапия, Агарь, Агата, Агафа, Агафоклия, Агафоника, Агафья, Аглаида, Аглая, Агнесса, Агния, Аграфена, Агриппина, Ада, Аделаида, Аделина, Аделла, Адель, Адельфина, Адина, Адолия, Адриана, Аза, Азалия, Азелла, Аида, Акилина, Аксинья, Акулина, Алевтина, Александра, Александрина, Алексина, Алёна, Алина, Алиса, Алла, Алфея, Альберта, Альбертина, Альбина, Альвина, Альфия, Амалия, Амата, Амелфа, Анастасия, Анатолия, Ангела, Ангелика, Ангелина, Анджела, Андрея, Андрона, Андроника, Анжела, Анжелика, Анисья, Анна, Антигона, Антонида, Антониана, Антонина, Антония, Анфима, Анфиса, Анфия, Анфуса, Аполлинария, Аполлония, Апраксия, Апрелия, Апфия, Аргентея, Ариадна, Арина, Ария, Арминия, Арсения, Артемида, Артемия, Аста, Астра, Афанасия, Аэлита, Беата, Беатриса, Белла, Бенедикта, Берта, Бландина, Богдана, Божена, Болеслава, Борислава, Бояна, Бронислава, Валентина, Валенсия, Валерия, Ванда, Варвара, Васёна, Василида, Василина, Василиса, Василия, Василла, Васса, Вацлава, Вевея, Велимира, Велислава, Венедикта, Венера, Венуста, Венцеслава, Вера, Вереника, Вероника, Верония, Веселина, Веста, Вестита, Вива, Вивея, Вивиана, Видана, Викентия, Викторина, Виктория, Вила, Вилена, Виленина, Вильгельмина, Виола, Виолетта, Виргиния, Виринея, Вита, Виталика, Виталина, Виталия, Влада, Владилена, Владимира, Владислава, Владлена, Власта, Воислава, Воля, Всеслава, Гаафа, Гала, Галата, Галатея, Гали, Галина, Галла, Галя, Гая, Геласия, Гемелла, Гемина, Гения, Геннадия, Геновефа, Генриетта, Георгина, Гера, Германа, Гертруда, Гея, Глафира, Гликерия, Глориоза, Голиндуха, Гонеста, Гонората, Горгония, Горислава, Гортензия, Градислава, Грета, Далила, Даная, Дарья, Дебора, Деина, Декабрина, Денисия, Диана, Дигна, Дина, Диодора, Дионина, Дия, Доброгнева, Добромила, Добромира, Доброслава, Доминика, Домитилла, Домна, Домника, Домникия, Домнина, Донара, Доната, Дора, Дорофея, Доса, Досифея, Дросида, Дуклида, Ева, Евангелина, Еванфия, Евгения, Евдокия, Евдоксия, Евлалия, Евлампия, Евмения, Евминия, Евника, Евникия, Евномия, Евпраксия, Евсевия, Евстафия, Евстолия, Евтихия, Евтропия, Евфалия, Евфимия, Евфросиния, Екатерина, Елена, Елизавета, Еликонида, Епистима, Епистимия, Ермиония, Ефимия, Ефросиния, Жанна, Жозефина, Зара, Зарема, Зарина, Заря, Заряна, Звезда, Земфира, Зенона, Зина, Зинаида, Зиновия, Злата, Зоя, Ива, Иванна, Ида, Идея, Иветта, Ивонна, Изабелла, Изида, Изольда, Илария, Илия, Илона, Ильина, Инга, Инесса, Инна, Иоанна, Иовилла, Иола, Иоланта, Ипполита, Ираида, Ирина, Ирма, Исидора, Ифигения, Ия, Каздоя, Казимира, Калерия, Калида, Калиса, Каллиникия, Каллиста, Кама, Камилла, Кандида, Капитолина, Карина, Каролина, Касиния, Келестина, Керкира, Кетевань, Киликия, Кима, Кира, Кириакия, Кириана, Кирилла, Клавдия, Клара, Клариса, Клементина, Клеопатра, Конкордия, Констанция, Корнелия, Кристина, Ксанфиппа, Ксения, Купава, Лавиния, Лавра, Лада, Лариса, Лаура, Леда, Лейла, Лемира, Ленина, Леокадия, Леонида, Леонила, Леонина, Леония, Лея, Лиана, Ливия, Лидия, Лилиана, Лилия, Лина, Лира, Лия, Лолия, Лонгина, Лора, Лота, Луиза, Лукерья, Лукиана, Лукия, Лукреция, Любава, Любовь, Любомила, Любомира, Людмила, Люцина, Люция, Мавра, Магда, Магдалина, Магна, Маина, Майя, Макрина, Максима, Малания, Малина, Мальвина, Мамелфа, Манефа, Маргарита, Мариам, Мариамна, Мариана, Марианна, Мариетта, Марина, Марионилла, Мария, Марка, Маркеллина, Маркиана, Марксина, Марлена, Марта, Мартина, Мартиниана, Марфа, Марья, Марьяна, Мастридия, Матильда, Матрёна, Матрона, Мая, Медея, Мелания, Мелитина, Меркурия, Мерона, Милана, Милена, Милица, Милия, Милослава, Милютина, Мина, Минна, Минодора, Мира, Миропия, Мирослава, Мирра, Митродора, Михайлина, Млада, Модеста, Моика, Моника, Мстислава, Муза, Нада, Надежда, Нана, Наркисса, Настасия, Наталия, Нелли, Ненила, Неонила, Нида, Ника, Нимфа, Нимфодора, Нина, Нинель, Новелла, Нонна, Ноэми, Ноябрина, Нунехия, Оксана, Октавия, Октябрина, Олдама, Олеся, Оливия, Олимпиада, Олимпиодора, Олимпия, Ольга, Ольда, Офелия, Павла, Павлина, Паисия, Паллада, Палладия, Пальмира, Параскева, Патрикия, Пелагея, Перегрина, Перпетуя, Петра, Петрина, Петронилла, Петрония, Пиама, Пинна, Плакида, Плакилла, Платонида, Поликсена, Поликсения, Полина, Поплия, Правдина, Прасковья, Пропедигна, Прискилла, Просдоха, Пульхерия, Рада, Радана, Радислава, Радмила, Радомила, Радомира, Радосвета, Радослава, Радость, Раиса, Рафаила, Рахиль, Ревекка, Ревмира, Регина, Рема, Рената, Римма, Рипсимия, Роберта, Рогнеда, Роза, Розалина, Розалинда, Розалия, Розина, Роксана, Романа, Ростислава, Русана, Руслана, Руфина, Руфиниана, Руфь, Сабина, Савватия, Савелла, Савина, Саломея, Сальвия, Самона, Сарра, Сатира, Светислава, Светлана, Светозара, Святослава, Севастьяна, Северина, Секлетея, Секлетинья, Селена, Селестина, Селина, Серафима, Сибилла, Сильва, Сильвана, Сильвестра, Сильвия, Симона, Синклитикия, Сира, Слава, Снадулия, Снежана, Сола, Соломонида, Соломония, Сосипатра, Софрония, Софья, Станислава, Стелла, Степанида, Стефанида, Стефания, Сусанна, Сюзанна, Тавифа, Таисия, Тамара, Тарасия, Татьяна, Текуса, Тереза, Тигрия, Тихомира, Тихослава, Тома, Томила, Транквиллина, Трифена, Трофима, Улита, Ульяна, Урбана, Урсула, Устина, Устиния, Фабиана, Фавста, Фавстина, Фаина, Фантина, Феврония, Федоза, Федора, Федосия, Федотия, Федула, Фёкла, Фекуса, Феликса, Фелица, Фелицата, Фелиция, Феогния, Феодора, Феодосия, Феодота, Феодотия, Феодула, Феодулия, Феозва, Феоктиста, Феона, Феонилла, Феония, Феопистия, Феосевия, Феофания, Феофила, Фервуфа, Фессалоника, Фессалоникия, Фетиния, Фея, Фива, Фивея, Филарета, Филиппа, Филиппия, Филомена, Филонилла, Филофея, Фиста, Флавия, Флёна, Флора, Флорентина, Флоренция, Флориана, Флорида, Фомаида, Фортуната, Фотина, Фотиния, Франциска, Фрида, Фридерика, Хаврония, Хариесса, Хариса, Харита, Харитина, Хиония, Хриса, Хрисия, Христиана, Христина, Цвета, Цветана, Целестина, Цецилия, Шарлотта, Шушаника, Эвелина, Эгина, Эдит, Эдита, Элеонора, Элисса, Элла, Эллада, Эллина, Элоиза, Эльвира, Эльза, Эльмира, Эмилиана, Эмилия, Эмма, Эннафа, Эра, Эрна, Эрнеста, Эрнестина, Эсмеральда, Эсфирь, Юдифь, Юлиана, Юлиания, Юлия, Юния, Юнона, Юрия, Юстина, Ядвига, Яна, Янина, Ярослава".replace(" ", "").split(",");
    static String[] city = "Абаза, Абакан, Абдулино, Абинск, Агидель, Агрыз, Адыгейск, Азнакаево, Азов, Ак-Довурак, Аксай, Алагир, Алапаевск, Алатырь, Алдан, Алейск, Александров, Александровск, Александровск-Сахалинский, Алексеевка, Алексин, Алзамай, Алупка, Алушта, Альметьевск, Амурск, Анадырь, Анапа, Ангарск, Андреаполь, Анжеро-Судженск, Анива, Апатиты, Апрелевка, Апшеронск, Арамиль, Аргун, Ардатов, Ардон, Арзамас, Аркадак, Армавир, Армянск, Арсеньев, Арск, Артём, Артёмовск, Артёмовский, Архангельск, Асбест, Асино, Астрахань, Аткарск, Ахтубинск, Ачинск, Аша, Бабаево, Бабушкин, Бавлы, Багратионовск, Байкальск, Баймак, Бакал, Баксан, Балабаново, Балаково, Балахна, Балашиха, Балашов, Балей, Балтийск, Барабинск, Барнаул, Барыш, Батайск, Бахчисарай, Бежецк, БелаяКалитва, БелаяХолуница, Белгород, Белебей, Белинский, Белово, Белогорск, Белогорск, Белозерск, Белокуриха, Беломорск, Белорецк, Белореченск, Белоусово, Белоярский, Белый, Белёв, Бердск, Березники, Берёзовский, Берёзовский, Беслан, Бийск, Бикин, Билибино, Биробиджан, Бирск, Бирюсинск, Бирюч, Благовещенск(Амурскаяобласть), Благовещенск(Башкортостан), Благодарный, Бобров, Богданович, Богородицк, Богородск, Боготол, Богучар, Бодайбо, Бокситогорск, Болгар, Бологое, Болотное, Болохово, Болхов, БольшойКамень, Бор, Борзя, Борисоглебск, Боровичи, Боровск, Бородино, Братск, Бронницы, Брянск, Бугульма, Бугуруслан, Будённовск, Бузулук, Буинск, Буй, Буйнакск, Бутурлиновка, Валдай, Валуйки, Велиж, ВеликиеЛуки, ВеликийНовгород, ВеликийУстюг, Вельск, Венёв, Верещагино, Верея, Верхнеуральск, ВерхнийТагил, ВерхнийУфалей, ВерхняяПышма, ВерхняяСалда, ВерхняяТура, Верхотурье, Верхоянск, Весьегонск, Ветлуга, Видное, Вилюйск, Вилючинск, Вихоревка, Вичуга, Владивосток, Владикавказ, Владимир, Волгоград, Волгодонск, Волгореченск, Волжск, Волжский, Вологда, Володарск, Волоколамск, Волосово, Волхов, Волчанск, Вольск, Воркута, Воронеж, Ворсма, Воскресенск, Воткинск, Всеволожск, Вуктыл, Выборг, Выкса, Высоковск, Высоцк, Вытегра, ВышнийВолочёк, Вяземский, Вязники, Вязьма, ВятскиеПоляны, ГавриловПосад, Гаврилов-Ям, Гагарин, Гаджиево, Гай, Галич, Гатчина, Гвардейск, Гдов, Геленджик, Георгиевск, Глазов, Голицыно, Горбатов, Горно-Алтайск, Горнозаводск, Горняк, Городец, Городище, Городовиковск, Гороховец, ГорячийКлюч, Грайворон, Гремячинск, Грозный, Грязи, Грязовец, Губаха, Губкин, Губкинский, Гудермес, Гуково, Гулькевичи, Гурьевск, Гурьевск, Гусев, Гусиноозёрск, Гусь-Хрустальный, Давлеканово, ДагестанскиеОгни, Далматово, Дальнегорск, Дальнереченск, Данилов, Данков, Дегтярск, Дедовск, Демидов, Дербент, Десногорск, Джанкой, Дзержинск, Дзержинский, Дивногорск, Дигора, Димитровград, Дмитриев, Дмитров, Дмитровск, Дно, Добрянка, Долгопрудный, Долинск, Домодедово, Донецк, Донской, Дорогобуж, Дрезна, Дубна, Дубовка, Дудинка, Духовщина, Дюртюли, Дятьково, Евпатория, Егорьевск, Ейск, Екатеринбург, Елабуга, Елец, Елизово, Ельня, Еманжелинск, Емва, Енисейск, Ермолино, Ершов, Ессентуки, Ефремов, Железноводск, Железногорск(Красноярскийкрай), Железногорск(Курскаяобласть), Железногорск-Илимский, Жердевка, Жигулёвск, Жиздра, Жирновск, Жуков, Жуковка, Жуковский, Завитинск, Заводоуковск, Заволжск, Заволжье, Задонск, Заинск, Закаменск, Заозёрный, Заозёрск, ЗападнаяДвина, Заполярный, Зарайск, Заречный(Пензенскаяобласть), Заречный(Свердловскаяобласть), Заринск, Звенигово, Звенигород, Зверево, Зеленогорск, Зеленоградск, Зеленодольск, Зеленокумск, Зерноград, Зея, Зима, Златоуст, Злынка, Змеиногорск, Знаменск, Зубцов, Зуевка, Ивангород, Иваново, Ивантеевка, Ивдель, Игарка, Ижевск, Избербаш, Изобильный, Иланский, Инза, Инкерман, Иннополис, Инсар, Инта, Ипатово, Ирбит, Иркутск, Исилькуль, Искитим, Истра, Ишим, Ишимбай, Йошкар-Ола, Кадников, Казань, Калач, Калач-на-Дону, Калачинск, Калининград, Калининск, Калтан, Калуга, Калязин, Камбарка, Каменка, Каменногорск, Каменск-Уральский, Каменск-Шахтинский, Камень-на-Оби, Камешково, Камызяк, Камышин, Камышлов, , , , Канаш, Кандалакша, Канск, Карабаново, Карабаш, Карабулак, Карасук, Карачаевск, Карачев, Каргат, Каргополь, Карпинск, Карталы, Касимов, Касли, Каспийск, Катав-Ивановск, Катайск, Качканар, Кашин, Кашира, Кедровый, Кемерово, Кемь, Керчь, Кизел, Кизилюрт, Кизляр, Кимовск, Кимры, Кингисепп, Кинель, Кинешма, Киреевск, Киренск, Киржач, Кириллов, Кириши, Киров(Калужскаяобласть), Киров(Кировскаяобласть), Кировград, Кирово-Чепецк, Кировск(Ленинградскаяобласть), Кировск(Мурманскаяобласть), Кирс, Кирсанов, Киселёвск, Кисловодск, Клин, Клинцы, Княгинино, Ковдор, Ковров, Ковылкино, Когалым, Кодинск, Козельск, Козловка, Козьмодемьянск, Кола, Кологрив, Коломна, Колпашево, Кольчугино, Коммунар, Комсомольск, Комсомольск-на-Амуре, Конаково, Кондопога, Кондрово, Константиновск, Копейск, Кораблино, Кореновск, Коркино, Королёв, Короча, Корсаков, Коряжма, Костерёво, Костомукша, Кострома, Котельники, Котельниково, Котельнич, Котлас, Котово, Котовск, Кохма, Красавино, Красноармейск, Красноармейск(Саратовскаяобласть), Красновишерск, Красногорск, Краснодар, Краснозаводск, Краснознаменск(Калининградскаяобласть), Краснознаменск, Краснокаменск, Краснокамск, Красноперекопск, Краснослободск(Волгоградскаяобласть), Краснослободск(Мордовия), Краснотурьинск, Красноуральск, Красноуфимск, Красноярск, КрасныйКут, КрасныйСулин, КрасныйХолм, Кремёнки, Кропоткин, Крымск, Кстово, Кубинка, Кувандык, Кувшиново, Кудымкар, Кузнецк, Куйбышев, Кулебаки, Кумертау, Кунгур, Купино, Курган, Курганинск, Курильск, Курлово, Куровское, Курск, Куртамыш, Курчатов, Куса, Кушва, Кызыл, Кыштым, Кяхта, Лабинск, Лабытнанги, Лагань, Ладушкин, Лаишево, Лакинск, Лангепас, Лахденпохья, Лебедянь, Лениногорск, Ленинск, Ленинск-Кузнецкий, Ленск, Лермонтов, Лесной, Лесозаводск, Лесосибирск, Ливны, Ликино-Дулёво, Липецк, Липки, Лиски, Лихославль, Лобня, ЛодейноеПоле, Лосино-Петровский, Луга, Луза, Лукоянов, Луховицы, Лысково, Лысьва, Лыткарино, Льгов, Любань, Люберцы, Любим, Людиново, Лянтор, Магадан, Магас, Магнитогорск, Майкоп, Майский, Макаров, Макарьев, Макушино, МалаяВишера, Малгобек, Малмыж, Малоархангельск, Малоярославец, Мамадыш, Мамоново, Мантурово, Мариинск, МариинскийПосад, Маркс, Махачкала, Мглин, Мегион, Медвежьегорск, Медногорск, Медынь, Межгорье, Междуреченск, Мезень, Меленки, Мелеуз, Менделеевск, Мензелинск, Мещовск, Миасс, Микунь, Миллерово, МинеральныеВоды, Минусинск, Миньяр, Мирный(Архангельскаяобласть), Мирный(Якутия), Михайлов, Михайловка, Михайловск(Свердловскаяобласть), Михайловск(Ставропольскийкрай), Мичуринск, Могоча, Можайск, Можга, Моздок, Мончегорск, Морозовск, Моршанск, Мосальск, Муравленко, Мураши, Мурманск, Муром, Мценск, Мыски, Мытищи, Мышкин, НабережныеЧелны, Навашино, Наволоки, Надым, Назарово, Назрань, Называевск, Нальчик, Нариманов, Наро-Фоминск, Нарткала, Нарьян-Мар, Находка, Невель, Невельск, Невинномысск, Невьянск, Нелидово, Неман, Нерехта, Нерчинск, Нерюнгри, Нестеров, Нефтегорск, Нефтекамск, Нефтекумск, Нефтеюганск, Нея, Нижневартовск, Нижнекамск, Нижнеудинск, НижниеСерги, НижнийЛомов, НижнийНовгород, НижнийТагил, НижняяСалда, НижняяТура, Николаевск, Николаевск-на-Амуре, Никольск(Вологодскаяобласть), Никольск(Пензенскаяобласть), Никольское, НоваяЛадога, НоваяЛяля, Новоалександровск, Новоалтайск, Новоаннинский, Нововоронеж, Новодвинск, Новозыбков, Новокубанск, Новокузнецк, Новокуйбышевск, Новомичуринск, Новомосковск, Новопавловск, Новоржев, Новороссийск, Новосибирск, Новосиль, Новосокольники, Новотроицк, Новоузенск, Новоульяновск, Новоуральск, Новохопёрск, Новочебоксарск, Новочеркасск, Новошахтинск, НовыйОскол, НовыйУренгой, Ногинск, Нолинск, Норильск, Ноябрьск, Нурлат, Нытва, Нюрба, Нягань, Нязепетровск, Няндома, Облучье, Обнинск, Обоянь, Обь, Одинцово, Озёрск(Калининградскаяобласть), Озёрск(Челябинскаяобласть), Озёры, Октябрьск, Октябрьский, Окуловка, Оленегорск, Олонец, Олёкминск, Омск, Омутнинск, Онега, Опочка, Оренбург, Орехово-Зуево, Орлов, Орск, Орёл, Оса, Осинники, Осташков, Остров, Островной, Острогожск, Отрадное, Отрадный, Оха, Оханск, Очёр, Павлово, Павловск, ПавловскийПосад, Палласовка, Партизанск, Певек, Пенза, Первомайск, Первоуральск, Перевоз, Пересвет, Переславль-Залесский, Пермь, Пестово, ПетровВал, Петровск, Петровск-Забайкальский, , , , Петрозаводск, Петропавловск-Камчатский, Петухово, Петушки, Печора, Печоры, Пикалёво, Пионерский, Питкяранта, Плавск, Пласт, Плёс, Поворино, Подольск, Подпорожье, Покачи, Покров, Покровск, Полевской, Полесск, Полысаево, ПолярныеЗори, Полярный, Поронайск, Порхов, Похвистнево, Почеп, Починок, Пошехонье, Правдинск, Приволжск, Приморск(Калининградскаяобласть), Приморск(Ленинградскаяобласть), Приморско-Ахтарск, Приозерск, Прокопьевск, Пролетарск, Протвино, Прохладный, Псков, Пугачёв, Пудож, Пустошка, Пучеж, Пушкино, Пущино, Пыталово, Пыть-Ях, Пятигорск, Радужный(Владимирскаяобласть), Радужный(Ханты-МансийскийАО–Югра), Райчихинск, Раменское, Рассказово, Ревда, Реж, Реутов, Ржев, Родники, Рославль, Россошь, Ростов, Ростов-на-Дону, Рошаль, Ртищево, Рубцовск, Рудня, Руза, Рузаевка, Рыбинск, Рыбное, Рыльск, Ряжск, Рязань, Саки, Салават, Салаир, Салехард, Сальск, Самара, Санкт-Петербург, Саранск, Сарапул, Саратов, Саров, Сасово, Сатка, Сафоново, Саяногорск, Саянск, Светлогорск, Светлоград, Светлый, Светогорск, Свирск, Свободный, Себеж, Севастополь, Северо-Курильск, Северобайкальск, Северодвинск, Североморск, Североуральск, Северск, Севск, Сегежа, Сельцо, Семикаракорск, Семилуки, Семёнов, Сенгилей, Серафимович, Сергач, СергиевПосад, Сердобск, Серов, Серпухов, Сертолово, Сибай, Сим, Симферополь, Сковородино, Скопин, Славгород, Славск, Славянск-на-Кубани, Сланцы, Слободской, Слюдянка, Смоленск, Снежинск, Снежногорск, Собинка, Советск(Калининградскаяобласть), Советск(Кировскаяобласть), Советск(Тульскаяобласть), СоветскаяГавань, Советский, Сокол, Солигалич, Соликамск, Солнечногорск, Соль-Илецк, Сольвычегодск, Сольцы, Сорочинск, Сорск, Сортавала, Сосенский, Сосновка, Сосновоборск, СосновыйБор, Сосногорск, Сочи, Спас-Деменск, Спас-Клепики, Спасск, Спасск-Дальний, Спасск-Рязанский, Среднеколымск, Среднеуральск, Сретенск, Ставрополь, СтараяКупавна, СтараяРусса, Старица, Стародуб, СтарыйКрым, СтарыйОскол, Стерлитамак, Стрежевой, Строитель, Струнино, Ступино, Суворов, Судак, Суджа, Судогда, Суздаль, Суоярви, Сураж, Сургут, Суровикино, Сурск, Сусуман, Сухиничи, СухойЛог, Сызрань, Сыктывкар, Сысерть, Сычёвка, Сясьстрой, Тавда, Таганрог, Тайга, Тайшет, Талдом, Тамбов, Тара, Тарко-Сале, Таруса, Татарск, Таштагол, Тверь, Теберда, Тейково, Темников, Темрюк, Терек, Тетюши, Тимашёвск, Тихвин, Тихорецк, Тобольск, Тогучин, Тольятти, Томари, Томмот, Томск, Топки, Торжок, Торопец, Тосно, Тотьма, Троицк, Трубчевск, Трёхгорный, Туапсе, Туймазы, Тула, Тулун, Туран, Туринск, Тутаев, Тында, Тырныауз, Тюкалинск, Тюмень, Уварово, Углегорск, Углич, Удачный, Удомля, Ужур, Узловая, Улан-Удэ, Ульяновск, Унеча, Урай, Урень, Уржум, Урус-Мартан, Урюпинск, Усинск, Усмань, Усолье, Усолье-Сибирское, Уссурийск, Усть-Джегута, Усть-Илимск, Усть-Катав, Усть-Кут, Усть-Лабинск, Устюжна, Уфа, Ухта, Учалы, Уяр, Фатеж, Феодосия, Фокино, Фролово, Фрязино, Фурманов, Хабаровск, Хадыженск, Ханты-Мансийск, Харабали, Харовск, Хасавюрт, Хвалынск, Хилок, Химки, Холм, Холмск, Хотьково, Цивильск, Цимлянск, Циолковский, Чадан, Чайковский, Чапаевск, Чаплыгин, Чебаркуль, Чебоксары, Чегем, Чекалин, Челябинск, Чердынь, Черемхово, Черепаново, Череповец, Черкесск, Черноголовка, Черногорск, Чернушка, Черняховск, Чехов, Чистополь, Чита, Чкаловск, Чудово, Чулым, Чусовой, Чухлома, Чёрмоз, Шагонар, Шадринск, Шали, Шарыпово, Шарья, Шатура, Шахты, Шахтёрск, Шахунья, Шацк, Шебекино, Шелехов, Шенкурск, Шилка, Шимановск, Шиханы, Шлиссельбург, Шумерля, Шумиха, Шуя, Щигры, Щучье, Щёкино, Щёлкино, Щёлково, Электрогорск, Электросталь, Электроугли, Элиста, Энгельс, Эртиль, Югорск, Южа, Южно-Сахалинск, Южно-Сухокумск, Южноуральск, Юрга, Юрьев-Польский, Юрьевец, Юрюзань, Юхнов, Ядрин, Якутск, Ялта, Ялуторовск, Янаул, Яранск, Яровое, Ярославль, Ярцево, Ясногорск, Ясный, Яхрома,".replace(" ", "").split(",");
    static String[] country = "Страны Азии: Азербайджан Армения Афганистан Бангладеш Бахрейн Бруней Бутан Восточный Тимор Вьетнам Грузия Израиль Индия Индонезия Иордания Ирак Иран Йемен Казахстан Узбекистан Камбоджа Катар Кипр Киргизия КНДР Китай Кувейт Лаос Ливан Макао (Аомынь) Малайзия Мальдивы Монголия Мьянма ( Бирма ) Непал ОАЭ Оман Пакистан Палестина «Парасельские острова» КНР, Вьетнам, Тайвань Саудовская Аравия Сингапур Сирия «Спартли острова» КНР, Вьетнам, Тайвань, Малайзия, Филиппины, Бруней Таджикистан Таиланд Туркменистан Турция Филиппины Шри-Ланка «Чагос острова» Великобритания Южная Корея Япония Страны Африки: Алжир Ангола Бенин Ботсвана Буркина-Фасо Бурунди Габон Гамбия Гана Гвинея Гвинея-Бисау Джибути Египет Замбия Западная Сахара Зимбабве Кабо-Верде Кот-д'Ивуар Камерун Кения Коморские острова Демократическая Республика Конго Народная Республика Конго Лесото Либерия Ливия Маврикий Мавритания Мадагаскар «Майотта» Франция Малави Мали Марокко Мозамбик Намибия Нигер Нигерия Реюньон Руанда Сан-Томе и Принсипи Свазиленд Святой Елены Остров Сейшельские острова Сенегал «Сеута и Мелилья» Испания Сомали Судан Сьерра-Леоне Танзания Того Тунис Уганда ЧАД Центрально-Африканская республика Экваториальная Гвинея Эритрея Эфиопия Южно-Африканская Республика Страны Европы: Австрия Андорра Албания Беларусь Бельгия Болгария Босния и Герцеговина Ватикан Великобритания Венгрия Германия Гибралтар Греция Дания Ирландия Исландия Испания Италия Латвия Литва Лихтенштейн Люксембург Македония Мальта Молдавия Монако Нидерланды Норвегия Польша Португалия Россия Румыния Сан-Марино Сербия и Черногория Словакия Словения Украина Фарерские острова Финляндия Франция Хорватия Черногория Чехия Швейцария Швеция «Шпицберген» Норвегия Эстония Страны и острова Океании: Австралия Вануату Гуам Восточное (Американское) Самоа Западное Самоа Кирибати Кокосовые острова Кука острова Маршаловы острова Мидуэй Микронезия Науру Ниуэ Новая Зеландия Новая Каледония Норфолк Палау Папуа-Новая Гвинея Питкэрн Рождества остров Северные Марианские острова Токелау Тонга Тувалу Уоллис и Футуна Уэйк Фиджи Французская полинезия Страны Северной Америки: Гренландия Канада Мексика Сен-Пьер и Микелон США Острова Карибского бассейна, страны/острова Центральной Америки: Ангилья (Ангуилла) Антигуа и Барбуда Нидерландские Антиллы Аруба Багамские острова Барбадос Белиз Бермудские острова Британские Виргинские острова Виргинские острова Гаити Гваделупа Гватемала Гондурас Гренада Доминика Доминиканская республика Каймановы острова Коста-Рика Куба Мартиника Монтсеррат Никарагуа Панама Пуэрто-Рико Сальвадор Сент-Винсент и Гренадины Сент-Китс и Невис Сент-Люсия Тёркс и Кайкос Тринидад и Тобаго Ямайка".replace(" ", ",").split(",");;
    public static void main(String[] argv) throws SQLException {

        System.out.println("Testing connection to PostgreSQL JDBC");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            try {
                statement.execute("drop table result; drop table competition; drop table sportsman;");
            } catch (Exception e) {
            }


            statement.execute("create table competition ( competition_id int constraint competition_pk primary key, competition_name text, world_record text, set_date date );");

            statement.execute("create table result ( result_id int constraint result_pk primary key,competition_id  int , sportsman_id  int, result  text , city  text, hold_date  text );");

            statement.execute("create table sportsman ( sportsman_id int constraint sportsman_pk primary key, sportsman_name  text, rank  text, country  text, personal_record  int, year_of_birth  int );");
            statement.execute("alter table result add constraint result_competition_competition_id_fk foreign key (competition_id) references competition; alter table result add constraint result_sportsman_sportsman_id_fk foreign key (sportsman_id) references sportsman;");

            for (int i = 0; i < 500; i++) {
                try {
                    statement.execute("INSERT INTO public.competition (competition_id , competition_name, world_record, set_date) VALUES (" + i + ", '" + name[(int) (Math.random() * name.length)] + "', '" + (int) (Math.random() * 9000) + "', '" + (1000 + (int) (Math.random() * 2020)) + "-" + (int) (Math.random() * 12) + "-" + (int) (Math.random() * 29) + "')");
                } catch (Exception e) {
                    i--;
                }
            }
            for (int i = 0; i < 500; i++) {
                try {
                    statement.execute("INSERT INTO public.sportsman (sportsman_id, sportsman_name, rank, country, personal_record, year_of_birth) VALUES (" + i + ", '" + name[(int) (Math.random() * name.length)] + "', '" + i + "', '" + country[(int) (Math.random() * country.length)] + "', " + i + ", " + (int) (Math.random() * 9000) + ")");

                }catch (SQLException e){
                    break;
                }
            }
            int i =0;
            int j = 0;
           while (  j<500 ){
                try {
                    i++;
                    statement.execute("INSERT INTO public.result (result_id, competition_id, sportsman_id, result, city, hold_date) VALUES (" + i + ", " + (int) (Math.random() * i) + ", " + (int) (Math.random() * i) + ", " + (int) (Math.random() * i) + ", '" + city[(int) (Math.random() * city.length)]  + "', " + (1000 + (int) (Math.random() * 2020)) + ")");
                    j++;
                    System.out.println(j);
                } catch (SQLException e) {
e.printStackTrace();
                }


            }


        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }

    }
}