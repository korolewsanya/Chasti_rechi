package rus.test.chasti_rechi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import rus.test.chasti_rechi.R;

public class Glag extends AppCompatActivity {

    //Очистка тв
    public void O() {
        TextView ttt = (TextView) findViewById(R.id.tv3);
        ttt.setText("");
        TextView t1 = (TextView) findViewById(R.id.tv4);
        t1.setText("");
        TextView t2 = (TextView) findViewById(R.id.tv5);
        t2.setText("");
        TextView t3 = (TextView) findViewById(R.id.tv6);
        t3.setText("");
        TextView t4 = (TextView) findViewById(R.id.tv7);
        t4.setText("");}

    Button b1;
    Button b2;
    Button b3;

    //Правильный ответ
    int prOt;

    //Полученное число
    int PolCh;

    String a1 = "   Наступили теплые летние дни.";
    String a1a = "  1) наступили";
    String a2 = "   Петька подарил Коле значок.";
    String a2a = "  1) подарил";
    String a3="   Я посмотрел на небо и увидел первую звезду.";
    String a3a="  1) посмотрел";
    String a3b="  2) увидел";
    String a4="   Максиму купили новый телефон.";
    String a4a="  1) купили";
    String a5="   Радуга радовала и успокаивала Марину.";
    String a5a="  1) радовала";
    String a5b="  2) успокаивала";
    String a6="   Дима громко захлопал в ладоши.";
    String a6a="  1) захлопал";
    String a7="   Буквы разбегались с линеек в разные стороны.";
    String a7a="  1) разбегались ";
    String a8="   Ветер был сильный и холодный.";
    String a8a="  1) был";
    String a9="   Ваня любил смотреть на быстрых рыбок.";
    String a9a="  1) любил";
    String a10="   Вечером родителей не было дома и я скучал.";
    String a10a="  1) не было";
    String a10b="  2) скучал";
    String a11="   Даша была разлохмаченная, без бантов.";
    String a11a="  1) была";
    String a12="   С запиской Рома подошёл ближе к маме.";
    String a12a="  1) подошел";
    String a13="   Огоньки свечей жёлтыми точками отражались в окне.";
    String a13a="  1) отражались";
    String a14="   От него пахло табаком и бензином.";
    String a14a="  1) пахло";
    String a15="   Вите понравился деревянный мостик.";
    String a15a="  1) понравился";
    String a16="   Миша кошачьим движением выхватил меч и выскочил за дверь.";
    String a16a="  1) выхватил";
    String a16b="  2) выскочил";
    String a17="   Он потрогал дверь, но задвижка была прочная.";
    String a17a="  1) потрогал";
    String a17b="  2) была";
    String a18="   Счастье сверкнуло перед Васей ослепительной искрой, поманило и погасло.";
    String a18a="  1) сверкнуло";
    String a18b="  2) поманило";
    String a18c="  3) погасло";
    String a19="   За окном дрожали яркие голубые звёзды.";
    String a19a="  1) дрожали";
    String a20="   Мы садились на поленья у горящего костра и пили чай.";
    String a20a="  1) садились";
    String a20b="  2) пили";
    String a21="   Пламя отражалось в глазах.";
    String a21a="  1) отражалось";
    String a22="   Я получил две пятерки по русскому.";
    String a22a="  1) получил";
    String a23="   Маша справилась с трудной задачей.";
    String a23a="  1) справилась";
    String a24="   Ваня помогал маме поливать красивые цветы.";
    String a24a="  1) помогал";
    String a24b="  2) поливать";
    String a25="   Мы пошли пить зелёный чай и позвали Катю.";
    String a25a="  1) пошли";
    String a25b="  2) позвали";
    String a26="   Кате снились высокие скалы.";
    String a26a="  1) снились";
    String a27="   Мама вздохнула и разрешила в школу не ходить.";
    String a27a="  1) вздохнула";
    String a27b="  2) разрешила";
    String a27c="  3) не ходить";
    String a28="   Маленькие котята бегали и играли.";
    String a28a="  1) бегали";
    String a28b="  2) играли";
    String a29="   Дима сжал в ладонях снежный комок и бросил.";
    String a29a="  1) сжал";
    String a29b="  2) бросил";
    String a30="   От сильного удара плот утонул.";
    String a30a="  1) утонул";
    String a31="   Ваня не заревел и не сдался.";
    String a31a="  1) не заревел";
    String a31b="  2) не сдался";
    String a32="   Я у Маши карандаши беру.";
    String a32a="  1) беру";
    String a33="   Она прибежала и посмотрела на маленького щенка.";
    String a33a="  1) прибежала";
    String a33b="  2) посмотрела";
    String a34="   Я сегодня встретил Васю.";
    String a34a="  1) встретил";
    String a35="   На синей клеенке стола лежала красная ароматная клубника.";
    String a35a="  1) лежала";
    String a36="   Петя оглянулся и посмотрел.";
    String a36a="  1) оглянулся";
    String a36b="  2) посмотрел";
    String a37="   Она ровно и неярко освещала комнату";
    String a37a="  1) освещала";
    String a38="   За окнами прогудела первая электричка.";
    String a38a="  1) прогудела";
    String a39="   За старым шкафом скреблись и пищали мыши.";
    String a39a="  1) скреблись";
    String a39b="  2) пищали";
    String a40="   Мы сильно полюбили дачу.";
    String a40a="  1) полюбили";
    String a41="   Высоко поднимается яркое солнце.";
    String a41a="  1) поднимается";
    String a42="   Пахнут смолой новые доски.";
    String a42a="  1) пахнут";
    String a43="   Тень медленно скользила по стене.";
    String a43a="  1) скользила";
    String a44="   Я с удовольствием смотрел концерт.";
    String a44a="  1) смотрел";
    String a45="   Папа приходил домой поздно.";
    String a45a="  1) приходил";
    String a46="   Мы не спорили о названии команды.";
    String a46a="  1) не спорили";
    String a47="   Мы поделили вкусное печенье.";
    String a47a="  1) поделили";
    String a48="   Он был худой и длинный.";
    String a48a="  1) был";
    String a49="   Дул тёплый южный ветер.";
    String a49a="  1) дул";
    String a50="   Мы сидели на новой лавочке и разговаривали.";
    String a50a="  1) сидели";
    String a50b="  2) разговаривали";
    String a51="   Маринка болтала ногами и хихикала.";
    String a51a="  1) болтала";
    String a51b="  2) хихикала";
    String a52="   На крыльце лежали старые тапки.";
    String a52a="  1) лежали";
    String a53="   Ваня не боялся ни темноты, ни собак.";
    String a53a="  1) не боялся";
    String a54="   Митя услышал выстрел.";
    String a54a="  1) услышал";
    String a55="   Ветер понес кораблик по волнам.";
    String a55a="  1) понес";
    String a56="   Рекс проводил Олю и вернулся.";
    String a56a="  1) проводил";
    String a56b="  2) вернулся";
    String a57="   Здесь пахло травой и влажной землей.";
    String a57a="  1) пахло";
    String a58="   Мама дала Пете белую рубашку и новые брюки.";
    String a58a="  1) дала";
    String a59="   Мы пошли направо.";
    String a59a="  1) пошли";
    String a60="   Прохладный воздух поднимался от реки.";
    String a60a="  1) поднимался";
    String a61="   Месяц отражался в реке.";
    String a61a="  1) отражался";
    String a62="   Вдруг из-за туч показался месяц.";
    String a62a="  1) показался";
    String a63="   Наступило чудесное время.";
    String a63a="  1) наступило";
    String a64="   Я уходил из дома ранним утром и приходил вечером.";
    String a64a="  1) уходил";
    String a64b="  2) приходил";
    String a65="   Я налил сок в большой стакан и быстро выпил.";
    String a65a="  1) налил";
    String a65b="  2) выпил";
    String a66="   Маша сходила за хлебом и помыла посуду.";
    String a66a="  1) сходила";
    String a66b="  2) помыла";
    String a67="   Ваня разделил конфеты и раздал детям.";
    String a67a="  1) разделил";
    String a67b="  2) раздал";
    String a68="   Он часто спорил и ссорился, но долго не злился.";
    String a68a="  1) спорил";
    String a68b="  2) ссорился";
    String a68c="  3) не злился";
    String a69="   Мы лежали и грелись на теплом песке.";
    String a69a="  1) лежали";
    String a69b="  2) грелись";
    String a70="   Мы сидели верхом на заборе и громко смеялись.";
    String a70a="  1) сидели";
    String a70b="  2) смеялись";
    String a71="   Зеленый жук выполз из банки.";
    String a71a="  1) выполз";
    String a72="   Надя сорвала одуванчик и загадала желание.";
    String a72a="  1) сорвала";
    String a72b="  2) загадала";
    String a73="   Ветерок качнул стебель и бабочка улетела.";
    String a73a="  1) качнул";
    String a73b="  2) улетела";
    String a74="   Мальчишки устроили веселый праздник.";
    String a74a="  1) устроили";
    String a75="   Владик показал сокровище маме.";
    String a75a="  1) показал";
    String a76="   Бабушка сварила суп и испекла булочки.";
    String a76a="  1) сварила";
    String a76b="  2) испекла";
    String a77="   Он нарисовал на тетрадном листе смешную рожицу.";
    String a77a="  1) нарисовал";
    String a78="   Даша была красивой девочкой.";
    String a78a="  1) была";
    String a79="   Волосы она заплетала в тугие косы.";
    String a79a="  1) заплетала";
    String a80="   Я отдышался на берегу реки.";
    String a80a="  1) отдышался";
    String a81="   За кустом, у реки стоял лисенок.";
    String a81a="  1) стоял";
    String a82="   Я хорошо играю в футбол.";
    String a82a="  1) играю";
    String a83="   Ваня схватился за стальной трос.";
    String a83a="  1) схватился";
    String a84="   По камням Славик добрался до берега.";
    String a84a="  1) добрался";
    String a85="   Матвей услышал голоса за углом и замер.";
    String a85a="  1) услышал";
    String a85b="  2) замер";
    String a86="   Саша собирал спелую малину.";
    String a86a="  1) собирал";
    String a87="   Они стояли около подъезда и ждали.";
    String a87a="  1) стояли";
    String a87b="  2) ждали";
    String a88="   Ребята махали руками и смеялись.";
    String a88a="  1) махали";
    String a88b="  2) смеялись";
    String a89="   Я помахал ребятам и поехал.";
    String a89a="  1) помахал";
    String a89b="  2) поехал";
    String a90="   В магазин привезли новый товар.";
    String a90a="  1) привезли";
    String a91="   Долго шли по болотам, ноги сбили об острые камни.";
    String a91a="  1) шли";
    String a91b="  2) сбили";
    String a92="   Из-за кустов показался медведь.";
    String a92a="  1) показался";
    String a93="   Ночью я разжёг костёр и налил чай.";
    String a93a="  1) разжёг";
    String a93b="  2) налил";
    String a94="   Утром выпал первый снег.";
    String a94a="  1) выпал";
    String a95="   На поляне росли красивые цветы.";
    String a95a="  1) росли";
    String a96="   Снежные вершины блестят на солнце.";
    String a96a="  1) блестят";
    String a97="   Потрескивают дрова в железной печке.";
    String a97a="  1) потрескивают";
    String a98="   Ночью был сильный дождь.";
    String a98a="  1) был";
    String a99="   К рассвету снегом замело дорогу.";
    String a99a="  1) замело";
    String a100="   Мы оставили лодку на берегу.";
    String a100a="  1) оставили";
    String a101="   Вид у Петьки был виноватый, от стыда спрятался.";
    String a101a="  1) был";
    String a101b="  2) спрятался";
    String a102="   Я взял длинную палку и сбил шишку.";
    String a102a="  1) взял";
    String a102b="  2) сбил";
    String a103="   Медвежата играли и валялись на траве.";
    String a103a="  1) играли";
    String a103b="  2) валялись";
    String a104="   Медведица искала ягоды и сладкие корешки.";
    String a104a="  1) искала";
    String a105="   К остановке подъехал автобус.";
    String a105a="  1) подъехал";
    String a106="   Щенок ходил по двору и искал кость.";
    String a106a="  1) ходил";
    String a106b="  2) искал";
    String a107="   Петя получил хорошую оценку.";
    String a107a="  1) получил";
    String a108="   Мы увидели красивого жука.";
    String a108a="  1) увидели";
    String a109="   Котенок охотился за бабочкой.";
    String a109a="  1) охотился";
    String a110="   Наступила зима, а листья не опали.";
    String a110a="  1) наступила";
    String a110b="  2) не опали";
    String a111="   Сильный дождь стучал по крыше.";
    String a111a="  1) стучал";
    String a112="   Над крышами летают шустрые ласточки.";
    String a112a="  1) летают";
    String a113="   Дикая утка с утятами плыла по реке.";
    String a113a="  1) плыла";
    String a114="   Громко квакали лягушки.";
    String a114a="  1) квакали";
    String a115="   Кошка лежала и грелась на солнышке.";
    String a115a="  1) лежала";
    String a115b="  2) грелась";
    String a116="   Летом я с папой ловили рыбу.";
    String a116a="  1) ловили";
    String a117="   Павлик гулял с друзьями.";
    String a117a="  1) гулял";
    String a118="   Я посмотрел интересное кино.";
    String a118a="  1) посмотрел";
    String a119="   Я с мамой поехал к бабушке.";
    String a119a="  1) поехал";
    String a120="   Мы играли в догонялки и рисовали мелками.";
    String a120a="  1) играли";
    String a120b="  2) рисовали";
    String a121="   Весной мы сажали морковку, капусту, картошку.";
    String a121a="  1) сажали";
    String a122="   Машина быстро неслась по шоссе.";
    String a122a="  1) неслась";
    String a123="   Гусь шипел и бежал за Васей.";
    String a123a="  1) шипел";
    String a123b="  2) бежал";
    String a124="   Цыплята клевали червяков и жучков.";
    String a124a="  1) клевали";
    String a125="   Папа копал, а Миша поливал.";
    String a125a="  1) копал";
    String a125b="  2) поливал";
    String a126="   Папа работает водителем.";
    String a126a="  1) работает";
    String a127="   Мама купила ткань и сшила платье.";
    String a127a="  1) купила";
    String a127b="  2) сшила";
    String a128="   Она пожарила картошку с грибами.";
    String a128a="  1) пожарила";
    String a129="   Павел снял сапоги и мокрую куртку.";
    String a129a="  1) снял";
    String a130="   Мы взяли корзинки и пошли за белыми грибы.";
    String a130a="  1) взяли";
    String a130b="  2) пошли";
    String a131="   Ваня прочитал интересную книгу про разведчиков.";
    String a131a="  1) прочитал";
    String a132="   Большая жёлтая луна встаёт над озером.";
    String a132a="  1) встаёт";

    public void A1() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a1);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A2() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a2);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A3() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a3);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A4() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a4);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A5() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a5);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A6() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a6);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A7() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a7);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A8() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a8);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A9() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a9);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A10() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a10);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A11() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a11);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A12() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a12);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A13() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a13);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A14() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a14);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A15() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a15);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A16() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a16);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A17() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a17);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A18() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a18);
        prOt = 3;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A19() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a19);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A20() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a20);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A21() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a21);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A22() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a22);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A23() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a23);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A24() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a24);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A25() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a25);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A26() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a26);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A27() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a27);
        prOt = 3;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A28() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a28);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A29() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a29);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A30() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a30);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A31() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a31);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A32() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a32);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A33() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a33);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A34() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a34);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A35() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a35);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A36() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a36);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A37() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a37);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A38() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a38);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A39() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a39);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A40() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a40);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A41() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a41);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A42() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a42);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A43() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a43);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A44() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a44);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A45() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a45);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A46() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a46);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A47() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a47);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A48() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a48);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A49() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a49);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A50() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a50);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A51() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a51);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A52() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a52);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A53() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a53);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A54() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a54);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A55() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a55);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A56() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a56);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A57() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a57);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A58() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a58);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A59() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a59);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A60() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a60);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A61() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a61);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A62() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a62);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A63() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a63);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A64() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a64);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A65() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a65);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A66() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a66);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A67() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a67);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A68() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a68);
        prOt = 3;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A69() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a69);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A70() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a70);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A71() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a71);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A72() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a72);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A73() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a73);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A74() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a74);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A75() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a75);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A76() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a76);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A77() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a77);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A78() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a78);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A79() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a79);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A80() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a80);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A81() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a81);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A82() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a82);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A83() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a83);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A84() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a84);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A85() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a85);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A86() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a86);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A87() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a87);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A88() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a88);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A89() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a89);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A90() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a90);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A91() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a91);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A92() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a92);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A93() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a93);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A94() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a94);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A95() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a95);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A96() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a96);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A97() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a97);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A98() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a98);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A99() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a99);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A100() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a100);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A101() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a101);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A102() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a102);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A103() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a103);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A104() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a104);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A105() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a105);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A106() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a106);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A107() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a107);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A108() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a108);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A109() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a109);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A110() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a110);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A111() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a111);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A112() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a112);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A113() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a113);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A114() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a114);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A115() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a115);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A116() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a116);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A117() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a117);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A118() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a118);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A119() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a119);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A120() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a120);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A121() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a121);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A122() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a122);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A123() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a123);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A124() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a124);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A125() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a125);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A126() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a126);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A127() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a127);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A128() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a128);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A129() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a129);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A130() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a130);
        prOt = 2;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A131() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a131);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }

    public void A132() {
        TextView t = (TextView) findViewById(R.id.tv1);
        t.setText(a132);
        prOt = 1;
        b1 = (Button) findViewById(R.id.b1);
        b1.setText("1");
        b2 = (Button) findViewById(R.id.b2);
        b2.setText("2");
        b3 = (Button) findViewById(R.id.b3);
        b3.setText("3");
    }


    //Присвоение техтВью правельного ответа
    public void PO() {
        TextView T4 = (TextView) findViewById(R.id.tv4);
        T4.setText("  Правильный ответ-  " + prOt + ":");
        T4.setTextColor(Color.MAGENTA);
    }

    public void PO1() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a1a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO2() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a2a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO3() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a3a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a3b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO4() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a4a);
        t1.setTextColor(Color.MAGENTA);

    }

    public void PO5() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a5a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a5b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO6() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a6a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO7() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a7a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO8() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a8a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO9() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a9a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO10() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a10a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a10b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO11() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a11a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO12() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a12a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO13() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a13a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO14() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a14a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO15() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a15a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO16() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a16a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a16b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO17() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a17a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a17b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO18() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a18a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a18b);
        t2.setTextColor(Color.MAGENTA);
        TextView t3 = (TextView) findViewById(R.id.tv7);
        t3.setText(a18c);
        t3.setTextColor(Color.MAGENTA);
    }

    public void PO19() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a19a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO20() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a20a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a20b);
    }

    public void PO21() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a21a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO22() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a22a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO23() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a23a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO24() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a24a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a24b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO25() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a25a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a25b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO26() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a26a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO27() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a27a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a27b);
        t2.setTextColor(Color.MAGENTA);
        TextView t3 = (TextView) findViewById(R.id.tv7);
        t3.setText(a27c);
        t3.setTextColor(Color.MAGENTA);
    }

    public void PO28() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a28a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a28b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO29() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a29a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a29b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO30() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a30a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO31() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a31a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a31b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO32() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a32a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO33() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a33a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a33b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO34() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a34a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO35() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a35a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO36() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a36a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a36b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO37() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a37a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO38() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a38a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO39() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a39a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a39b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO40() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a40a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO41() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a41a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO42() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a42a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO43() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a43a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO44() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a44a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO45() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a45a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO46() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a46a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO47() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a47a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO48() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a48a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO49() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a49a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO50() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a50a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a50b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO51() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a51a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a51b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO52() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a52a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO53() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a53a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO54() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a54a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO55() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a55a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO56() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a56a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a56b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO57() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a57a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO58() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a58a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO59() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a59a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO60() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a60a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO61() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a61a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO62() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a62a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO63() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a63a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO64() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a64a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a64b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO65() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a65a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a65b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO66() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a66a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a66b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO67() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a67a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a67b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO68() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a68a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a68b);
        t2.setTextColor(Color.MAGENTA);
        TextView t3 = (TextView) findViewById(R.id.tv7);
        t3.setText(a68c);
        t3.setTextColor(Color.MAGENTA);
    }

    public void PO69() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a69a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a69b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO70() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a70a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a70b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO71() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a71a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO72() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a72a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a72b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO73() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a73a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a73b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO74() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a74a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO75() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a75a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO76() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a76a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a76b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO77() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a77a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO78() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a78a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO79() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a79a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO80() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a80a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO81() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a81a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO82() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a82a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO83() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a83a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO84() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a84a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO85() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a85a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a85b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO86() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a86a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO87() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a87a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a87b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO88() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a88a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a88b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO89() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a89a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a89b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO90() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a90a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO91() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a91a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a91b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO92() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a92a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO93() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a93a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a93b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO94() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a94a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO95() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a95a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO96() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a96a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO97() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a97a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO98() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a98a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO99() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a99a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO100() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a100a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO101() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a101a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a101b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO102() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a102a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a102b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO103() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a103a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a103b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO104() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a104a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO105() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a105a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO106() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a106a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a106b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO107() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a107a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO108() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a108a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO109() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a109a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO110() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a110a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a110b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO111() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a111a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO112() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a112a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO113() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a113a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO114() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a114a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO115() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a115a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a115b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO116() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a116a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO117() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a117a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO118() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a118a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO119() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a119a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO120() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a120a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a120b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO121() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a121a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO122() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a122a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO123() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a123a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a123b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO124() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a124a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO125() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a125a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a125b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO126() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a126a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO127() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a127a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a127b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO128() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a128a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO129() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a129a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO130() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a130a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a130b);
    }

    public void PO131() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a131a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO132() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a132a);
        t1.setTextColor(Color.MAGENTA);
    }


    int x1 = 0;

    public void next1() {
        x1++;
        switch (x1) {
            case 1:
                PO1();
                break;
            case 2:
                PO2();
                break;
            case 3:
                PO3();
                break;
            case 4:
                PO4();
                break;
            case 5:
                PO5();
                break;
            case 6:
                PO6();
                break;
            case 7:
                PO7();
                break;
            case 8:
                PO8();
                break;
            case 9:
                PO9();
                break;
            case 10:
                PO10();
                break;
            case 11:
                PO11();
                break;
            case 12:
                PO12();
                break;
            case 13:
                PO13();
                break;
            case 14:
                PO14();
                break;
            case 15:
                PO15();
                break;
            case 16:
                PO16();
                break;
            case 17:
                PO17();
                break;
            case 18:
                PO18();
                break;
            case 19:
                PO19();
                break;
            case 20:
                PO20();
                break;
            case 21:
                PO21();
                break;
            case 22:
                PO22();
                break;
            case 23:
                PO23();
                break;
            case 24:
                PO24();
                break;
            case 25:
                PO25();
                break;
            case 26:
                PO26();
                break;
            case 27:
                PO27();
                break;
            case 28:
                PO28();
                break;
            case 29:
                PO29();
                break;
            case 30:
                PO30();
                break;
            case 31:
                PO31();
                break;
            case 32:
                PO32();
                break;
            case 33:
                PO33();
                break;
            case 34:
                PO34();
                break;
            case 35:
                PO35();
                break;
            case 36:
                PO36();
                break;
            case 37:
                PO37();
                break;
            case 38:
                PO38();
                break;
            case 39:
                PO39();
                break;
            case 40:
                PO40();
                break;
            case 41:
                PO41();
                break;
            case 42:
                PO42();
                break;
            case 43:
                PO43();
                break;
            case 44:
                PO44();
                break;
            case 45:
                PO45();
                break;
            case 46:
                PO46();
                break;
            case 47:
                PO47();
                break;
            case 48:
                PO48();
                break;
            case 49:
                PO49();
                break;
            case 50:
                PO50();
                break;
            case 51:
                PO51();
                break;
            case 52:
                PO52();
                break;
            case 53:
                PO53();
                break;
            case 54:
                PO54();
                break;
            case 55:
                PO55();
                break;
            case 56:
                PO56();
                break;
            case 57:
                PO57();
                break;
            case 58:
                PO58();
                break;
            case 59:
                PO59();
                break;
            case 60:
                PO60();
                break;
            case 61:
                PO61();
                break;
            case 62:
                PO62();
                break;
            case 63:
                PO63();
                break;
            case 64:
                PO64();
                break;
            case 65:
                PO65();
                break;
            case 66:
                PO66();
                break;
            case 67:
                PO67();
                break;
            case 68:
                PO68();
                break;
            case 69:
                PO69();
                break;
            case 70:
                PO70();
                break;
            case 71:
                PO71();
                break;
            case 72:
                PO72();
                break;
            case 73:
                PO73();
                break;
            case 74:
                PO74();
                break;
            case 75:
                PO75();
                break;
            case 76:
                PO76();
                break;
            case 77:
                PO77();
                break;
            case 78:
                PO78();
                break;
            case 79:
                PO79();
                break;
            case 80:
                PO80();
                break;
            case 81:
                PO81();
                break;
            case 82:
                PO82();
                break;
            case 83:
                PO83();
                break;
            case 84:
                PO84();
                break;
            case 85:
                PO85();
                break;
            case 86:
                PO86();
                break;
            case 87:
                PO87();
                break;
            case 88:
                PO88();
                break;
            case 89:
                PO89();
                break;
            case 90:
                PO90();
                break;
            case 91:
                PO91();
                break;
            case 92:
                PO92();
                break;
            case 93:
                PO93();
                break;
            case 94:
                PO94();
                break;
            case 95:
                PO95();
                break;
            case 96:
                PO96();
                break;
            case 97:
                PO97();
                break;
            case 98:
                PO98();
                break;
            case 99:
                PO99();
                break;
            case 100:
                PO100();
                break;
            case 101:
                PO101();
                break;
            case 102:
                PO102();
                break;
            case 103:
                PO103();
                break;
            case 104:
                PO104();
                break;
            case 105:
                PO105();
                break;
            case 106:
                PO106();
                break;
            case 107:
                PO107();
                break;
            case 108:
                PO108();
                break;
            case 109:
                PO109();
                break;
            case 110:
                PO110();
                break;
            case 111:
                PO111();
                break;
            case 112:
                PO112();
                break;
            case 113:
                PO113();
                break;
            case 114:
                PO114();
                break;
            case 115:
                PO115();
                break;
            case 116:
                PO116();
                break;
            case 117:
                PO117();
                break;
            case 118:
                PO118();
                break;
            case 119:
                PO119();
                break;
            case 120:
                PO120();
                break;
            case 121:
                PO121();
                break;
            case 122:
                PO122();
                break;
            case 123:
                PO123();
                break;
            case 124:
                PO124();
                break;
            case 125:
                PO125();
                break;
            case 126:
                PO126();
                break;
            case 127:
                PO127();
                break;
            case 128:
                PO128();
                break;
            case 129:
                PO129();
                break;
            case 130:
                PO130();
                break;
            case 131:
                PO131();
                break;
            case 132:
                PO132();
                break;
        }
        if (x1 > 131) {
            x1 = 0;
        }

    }

    public void Vop1(){ TextView t = (TextView) findViewById(R.id.tv2);
        t.setText("Сколько в приложении глаголов?");
    t.setTextColor(Color.RED);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glag);

        //Запрет поворота экрана
        setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

       Vop1();

        O();
        A1();
    }

    int x = 0;

    public void next() {
        x++;
        switch (x) {
            case 1:
                A2();
                break;
            case 2:
                A3();
                break;
            case 3:
                A4();
                break;
            case 4:
                A5();
                break;
            case 5:
                A6();
                break;
            case 6:
                A7();
                break;
            case 7:
                A8();
                break;
            case 8:
                A9();
                break;
            case 9:
                A10();
                break;
            case 10:
                A11();
                break;
            case 11:
                A12();
                break;
            case 12:
                A13();
                break;
            case 13:
                A14();
                break;
            case 14:
                A15();
                break;
            case 15:
                A16();
                break;
            case 16:
                A17();
                break;
            case 17:
                A18();
                break;
            case 18:
                A19();
                break;
            case 19:
                A20();
                break;
            case 20:
                A21();
                break;
            case 21:
                A22();
                break;
            case 22:
                A23();
                break;
            case 23:
                A24();
                break;
            case 24:
                A25();
                break;
            case 25:
                A26();
                break;
            case 26:
                A27();
                break;
            case 27:
                A28();
                break;
            case 28:
                A29();
                break;
            case 29:
                A30();
                break;
            case 30:
                A31();
                break;
            case 31:
                A32();
                break;
            case 32:
                A33();
                break;
            case 33:
                A34();
                break;
            case 34:
                A35();
                break;
            case 35:
                A36();
                break;
            case 36:
                A37();
                break;
            case 37:
                A38();
                break;
            case 38:
                A39();
                break;
            case 39:
                A40();
                break;
            case 40:
                A41();
                break;
            case 41:
                A42();
                break;
            case 42:
                A43();
                break;
            case 43:
                A44();
                break;
            case 44:
                A45();
                break;
            case 45:
                A46();
                break;
            case 46:
                A47();
                break;
            case 47:
                A48();
                break;
            case 48:
                A49();
                break;
            case 49:
                A50();
                break;
            case 50:
                A51();
                break;
            case 51:
                A52();
                break;
            case 52:
                A53();
                break;
            case 53:
                A54();
                break;
            case 54:
                A55();
                break;
            case 55:
                A56();
                break;
            case 56:
                A57();
                break;
            case 57:
                A58();
                break;
            case 58:
                A59();
                break;
            case 59:
                A60();
                break;
            case 60:
                A61();
                break;
            case 61:
                A62();
                break;
            case 62:
                A63();
                break;
            case 63:
                A64();
                break;
            case 64:
                A65();
                break;
            case 65:
                A66();
                break;
            case 66:
                A67();
                break;
            case 67:
                A68();
                break;
            case 68:
                A69();
                break;
            case 69:
                A70();
                break;
            case 70:
                A71();
                break;
            case 71:
                A72();
                break;
            case 72:
                A73();
                break;
            case 73:
                A74();
                break;
            case 74:
                A75();
                break;
            case 75:
                A76();
                break;
            case 76:
                A77();
                break;
            case 77:
                A78();
                break;
            case 78:
                A79();
                break;
            case 79:
                A80();
                break;
            case 80:
                A81();
                break;
            case 81:
                A82();
                break;
            case 82:
                A83();
                break;
            case 83:
                A84();
                break;
            case 84:
                A85();
                break;
            case 85:
                A86();
                break;
            case 86:
                A87();
                break;
            case 87:
                A88();
                break;
            case 88:
                A89();
                break;
            case 89:
                A90();
                break;
            case 90:
                A91();
                break;
            case 91:
                A92();
                break;
            case 92:
                A93();
                break;
            case 93:
                A94();
                break;
            case 94:
                A95();
                break;
            case 95:
                A96();
                break;
            case 96:
                A97();
                break;
            case 97:
                A98();
                break;
            case 98:
                A99();
                break;
            case 99:
                A100();
                break;
            case 100:
                A101();
                break;
            case 101:
                A102();
                break;
            case 102:
                A103();
                break;
            case 103:
                A104();
                break;
            case 104:
                A105();
                break;
            case 105:
                A106();
                break;
            case 106:
                A107();
                break;
            case 107:
                A108();
                break;
            case 108:
                A109();
                break;
            case 109:
                A110();
                break;
            case 110:
                A111();
                break;
            case 111:
                A112();
                break;
            case 112:
                A113();
                break;
            case 113:
                A114();
                break;
            case 114:
                A115();
                break;
            case 115:
                A116();
                break;
            case 116:
                A117();
                break;
            case 117:
                A118();
                break;
            case 118:
                A119();
                break;
            case 119:
                A120();
                break;
            case 120:
                A121();
                break;
            case 121:
                A122();
                break;
            case 122:
                A123();
                break;
            case 123:
                A124();
                break;
            case 124:
                A125();
                break;
            case 125:
                A126();
                break;
            case 126:
                A127();
                break;
            case 127:
                A128();
                break;
            case 128:
                A129();
                break;
            case 129:
                A130();
                break;
            case 130:
                A131();
                break;
            case 131:
                A132();
                break;
            case 132:
                A1();
                break;
        }
        if (x > 131) {
            x = 0;
        }
    }


    //Подсчет правельных ответов
    int kolPr = 0;
    String kolP;

    public void KolPr() {
        kolPr++;
        kolP = Integer.toString(kolPr);
        TextView T12 = (TextView) findViewById(R.id.tv8);
        T12.setText("  Правильных ответов- "+kolP);
    }

    //Подсчет неправельных ответов
    int kolNpr = 0;
    String kolNp;

    public void KolNpr() {
        kolNpr++;
        kolNp = Integer.toString(kolNpr);
        TextView T13 = (TextView) findViewById(R.id.tv9);
        T13.setText("  Неправильных ответов- "+kolNp);
    }


    //Запрет нажатия кнопок
    public void ZapNa() {
        Button b = (Button) findViewById(R.id.b1);
        b.setClickable(false);
        Button b2 = (Button) findViewById(R.id.b2);
        b2.setClickable(false);
        Button b3 = (Button) findViewById(R.id.b3);
        b3.setClickable(false);
    }


    //Разрешение нажатия кнопок
    public void RazNa() {
        Button b = (Button) findViewById(R.id.b1);
        b.setClickable(true);
        Button b2 = (Button) findViewById(R.id.b2);
        b2.setClickable(true);
        Button b3 = (Button) findViewById(R.id.b3);
        b3.setClickable(true);
    }

    //Кол-во прощенных
    int kolProp = 0;
    String kolPpop;

    //Подсчет пропущенных
    public void KolProp() {
        kolProp++;
        kolPpop = Integer.toString(kolProp);
        TextView T18 = (TextView) findViewById(R.id.tv10);
        T18.setText("  Пропущено- "+kolPpop);}


    int i = 0;
    int j = 0;
    int k = 0;


    public void Clik (View v){
        switch (v.getId()) {
            case R.id.b1:
                i=1;
                PolCh = Integer.parseInt("" + b1.getText());
                if (PolCh == prOt) {
                    TextView T9 = (TextView) findViewById(R.id.tv3);
                    T9.setText("  ПРАВИЛЬНО");
                    T9.setTextColor(Color.GREEN);
                    KolPr();
                    ZapNa();
                } else {
                    TextView T9 = (TextView) findViewById(R.id.tv3);
                    T9.setText("  НЕПРАВИЛЬНО");
                    T9.setTextColor(Color.RED);
                    KolNpr();
                    ZapNa();}
                PO();
                next1();
                break;

            case R.id.b2:
                j=1;
                PolCh = Integer.parseInt("" + b2.getText());
                if (PolCh == prOt) {
                    TextView T9 = (TextView) findViewById(R.id.tv3);
                    T9.setText("  ПРАВИЛЬНО");
                    T9.setTextColor(Color.GREEN);
                    KolPr();
                    ZapNa();
                } else {
                    TextView T9 = (TextView) findViewById(R.id.tv3);
                    T9.setText("  НЕПРАВИЛЬНО");
                    T9.setTextColor(Color.RED);
                    KolNpr();
                    ZapNa();
                }
                PO();
                next1();
                break;

            case R.id.b3:
                k=1;
                PolCh = Integer.parseInt("" + b3.getText());
                if (PolCh == prOt) {
                    TextView T9 = (TextView) findViewById(R.id.tv3);
                    T9.setText("  ПРАВИЛЬНО");
                    T9.setTextColor(Color.GREEN);
                    KolPr();
                    ZapNa();
                } else {
                    TextView T9 = (TextView) findViewById(R.id.tv3);
                    T9.setText("  НЕПРАВИЛЬНО");
                    T9.setTextColor(Color.RED);
                    KolNpr();
                    ZapNa();
                }
                PO();
                next1();
                break;

            case R.id.b4:
                if(i!=1&j!=1&k!=1){KolProp();}
                if(i!=1&j!=1&k!=1){next1();}
                i=0;
                j=0;
                k=0;
                next();
                TextView T9 = (TextView) findViewById(R.id.tv3);
                T9.setText("                     ");
                TextView T14 = (TextView) findViewById(R.id.tv4);
                T14.setText("");
                TextView T9a = (TextView) findViewById(R.id.tv5);
                T9a.setText("                     ");
                TextView T14a = (TextView) findViewById(R.id.tv6);
                T14a.setText("");
                TextView T14b = (TextView) findViewById(R.id.tv7);
                T14b.setText("");
                RazNa();

                break;
        }

    }

}
