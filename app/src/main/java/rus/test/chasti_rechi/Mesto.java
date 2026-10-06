package rus.test.chasti_rechi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import rus.test.chasti_rechi.R;

public class Mesto extends AppCompatActivity {

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

    String a1="   Они теплые и летние.";
    String a1a="  1) они";
    String a2="   Он подарил ему значок.";
    String a2a="  1) он";
    String a2b="  2) ему";
    String a3="   Я посмотрел на небо и увидел первую звезду.";
    String a3a="  1) я";
    String a4="   Они купили новый телефон.";
    String a4a="  1) Они";
    String a5="   Она успокоила Марину.";
    String a5a="  1) она";
    String a6="   Они побежали на их огород.";
    String a6a="  1) они";
    String a6b="  2) их";
    String a7="   Он любил смотреть с нами рыбок.";
    String a7a="  1) он";
    String a7b="  2) нами";
    String a8="   Я люблю молочный шоколад.";
    String a8a="  1) я";
    String a9="   Она отдала Ване мой велосипед.";
    String a9a="  1) она";
    String a9b="  2) мой";
    String a10="   С запиской Рома подошёл ближе к ней.";
    String a10a="  1) ней";
    String a11="   Огоньки свечей отражались в нём.";
    String a11a="  1) нём";
    String a12="   От него пахло табаком и бензином.";
    String a12a="  1) него";
    String a13="   Он порадовал маму своими оценками.";
    String a13a="  1) он";
    String a13b="  2) своими";
    String a14="   Миша открыл своим ножом их банку.";
    String a14a="  1) своим";
    String a14b="  2) их";
    String a15="   Он потрогал дверь, но она была заперта.";
    String a15a="  1) он";
    String a15b="  2) она";
    String a16="   Оно ярко сверкало.";
    String a16a="  1) оно";
    String a17="   Мы садились у костра и вспоминали о наших приключениях.";
    String a17a="  1) мы";
    String a17b="  2) наших";
    String a18="   Пламя отражалось в её глазах.";
    String a18a="  1) её";
    String a19="   Я хорошо окончил четверть.";
    String a19a="  1) я";
    String a20="   Маша справилась со своей задачей.";
    String a20a="  1) своей";
    String a21="   Мы помогли ей полить цветы.";
    String a21a="  1) мы";
    String a21b="  2) ей";
    String a22="   Мы пошли пить чай с её печеньем.";
    String a22a="  1) мы";
    String a22b="  2) её";
    String a23="   Ей снились высокие скалы.";
    String a23a="  1) ей";
    String a24="   Мама нам разрешила погулять у них во дворе.";
    String a24a="  1) нам";
    String a24b="  2) них";
    String a25="   Они бегали и играли.";
    String a25a="  1) они";
    String a26="   От его сильного удара он упал.";
    String a26a="  1) его";
    String a26b="  2) он";
    String a27="   Я забрал свои карандаши.";
    String a27a="  1) я";
    String a27b="  2) свои";
    String a28="   Она прибежала и посмотрела на него.";
    String a28a="  1) она";
    String a28b="  2) него";
    String a29="   Я сегодня встретил нашу учительницу.";
    String a29a="  1) я";
    String a29b="  2) нашу";
    String a30="   На столе лежал ваш блокнот.";
    String a30a="  1) ваш";
    String a31="   Он оглянулся и увидел их.";
    String a31a="  1) он";
    String a31b="  2) их";
    String a32="   Она ровно и неярко освещала нашу комнату";
    String a32a="  1) она";
    String a32b="  2) нашу";
    String a33="   За её окнами прогудела первая электричка.";
    String a33a="  1) её";
    String a34="   За старым шкафом они скреблись и пищали.";
    String a34a="  1) они";
    String a35="   Мы сильно полюбили нашу дачу.";
    String a35a="  1) мы";
    String a35b="  2) нашу";
    String a36="   Его тень медленно скользила по стене.";
    String a36a="  1) его";
    String a37="   Я с удовольствием смотрел её концерт.";
    String a37a="  1) я";
    String a37b="  2) её";
    String a38="   Мама купила мне мороженое, а себе сок.";
    String a38a="  1) мне";
    String a38b="  2) себе";
    String a39="   Мы не спорили о названии нашей команды.";
    String a39a="  1) мы";
    String a39b="  2) нашей";
    String a40="   Она разделила печенье между всеми.";
    String a40a="  1) она";
    String a40b="  2) всеми";
    String a41="   Мы сидели на новой лавочке и разговаривали с ней.";
    String a41a="  1) мы";
    String a41b="  2) ней";
    String a42="   На крыльце лежали его старые тапки.";
    String a42a="  1) его";
    String a43="   Ваш Ваня не испугался собак.";
    String a43a="  1) ваш";
    String a44="   Он проводил Олю и вернулся к нам.";
    String a44a="  1) он";
    String a44b="  2) нам";
    String a45="   Мама погладила ему белую рубашку.";
    String a45a="  1) ему";
    String a46="   Мы поймали бабочку.";
    String a46a="  1) мы";
    String a47="   Я люблю с ним петь песни.";
    String a47a="  1) я";
    String a47b="  2) ним";
    String a48="   Я налил сок ему в стакан.";
    String a48a="  1) я";
    String a48b="  2) ему";
    String a49="   Я ходила с тобой в парк.";
    String a49a="  1) я";
    String a49b="  2) тобой";
    String a50="   Вы сделаете нам воздушного змея?";
    String a50a="  1) вы";
    String a50b="  2) нам";
    String a51="   Мы лежали и грелись на тёплом песке.";
    String a51a="  1) мы";
    String a52="   Они не заметили его во время игры.";
    String a52a="  1) они";
    String a52b="  2) его";
    String a53="   Майский жук выполз из моей банки.";
    String a53a="  1) моей";
    String a54="   Вы сорвали ромашки с моей клумбы?";
    String a54a="  1) Вы";
    String a54b="  2) моей";
    String a55="   Ветерок качнул стебель и она улетела.";
    String a55a="  1) она";
    String a56="   Мальчишки устроили для них веселый праздник.";
    String a56a="  1) них";
    String a57="   Он нарисовал на её тетрадном листе смешную рожицу.";
    String a57a="  1) он";
    String a57b="  2) её";
    String a58="   Волосы она заплетала в тугие косы.";
    String a58a="  1) она";
    String a59="   Он схватился за стальной трос.";
    String a59a="  1) он";
    String a60="   Она собирала спелую малину.";
    String a60a="  1) она";
    String a61="   Они стояли около подъезда и ждали.";
    String a61a="  1) они";
    String a62="   Ребята им махали руками и смеялись.";
    String a62a="  1) им";
    String a63="   Я помахал ребятам и поехал.";
    String a63a="  1) я";
    String a64="   Они долго шли по болотам.";
    String a64a="  1) они";
    String a65="   Я разжёг костёр и налил им чай.";
    String a65a="  1) я";
    String a65b="  2) им";
    String a66="   Мы посадили дерево.";
    String a66a="  1) мы";
    String a67="   На поляне росли твои любимые цветы.";
    String a67a="  1) твои";
    String a68="   Мы нашли старую лодку.";
    String a68a="  1) мы";
    String a69="   Вид у него был виноватый.";
    String a69a="  1) него";
    String a70="   К остановке подъехал наш автобус.";
    String a70a="  1) наш";
    String a71="   Он нашёл ваш ключ.";
    String a71a="  1) он";
    String a71b="  2) ваш";
    String a72="   Мы увидели красивого жука.";
    String a72a="  1) мы";
    String a73="   Твой щенок напугал моего котёнка.";
    String a73a="  1) твой";
    String a73b="  2) моего";
    String a74="   Вы наступили на гриб.";
    String a74a="  1) вы";
    String a75="   Я нашёл футбольный мяч.";
    String a75a="  1) я";
    String a76="   Они летали над его крышей.";
    String a76a="  1) они";
    String a76b="  2) его";
    String a77="   Она бежала за нами.";
    String a77a="  1) она";
    String a77b="  2) нами";
    String a78="   Она лежала и грелась на солнышке.";
    String a78a="  1) она";
    String a79="   Мы поймали щуку.";
    String a79a="  1) мы";
    String a80="   Павлик гулял у них.";
    String a80a="  1) них";
    String a81="   Я посмотрел интересное кино.";
    String a81a="  1) я";
    String a82="   Я с мамой поехал за ней.";
    String a82a="  1) я";
    String a82b="  2) ней";
    String a83="   Мы с ним играли в догонялки и рисовали мелками.";
    String a83a="  1) мы";
    String a83b="  2) ним";
    String a84="   Мы посадили овощи на нашей даче.";
    String a84a="  1) мы";
    String a84b="  2) нашей";
    String a85="   Ваши вещи высохли.";
    String a85a="  1) ваши";
    String a86="   Его собаки злые.";
    String a86a="  1) его";
    String a87="   Они громко пищали.";
    String a87a="  1) они";
    String a88="   Миша полил твои грядки.";
    String a88a="  1) твои";
    String a89="   Он работает водителем.";
    String a89a="  1) он";
    String a90="   Мама купила его в магазине.";
    String a90a="  1) его";
    String a91="   Она пожарила с ними картошку.";
    String a91a="  1) Она";
    String a91b="  2) ними";
    String a92="   Он снял её и повесил.";
    String a92a="  1) Он";
    String a92b="  2) её";
    String a93="   Мы взяли корзинки и пошли за ними.";
    String a93a="  1) мы";
    String a93b="  2) ними";
    String a94="   Он прочитал интересную книгу.";
    String a94a="  1) он";
    String a95="   Луна встаёт над озером и она жёлтая.";
    String a95a="  1) она";




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
        prOt = 2;
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
        prOt = 1;
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
        prOt = 1;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 1;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 1;
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
        prOt = 1;
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
        prOt = 1;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 1;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 1;
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
        prOt = 2;
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
        prOt = 1;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 1;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 1;
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
        prOt = 2;
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
        prOt = 1;
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
        prOt = 1;
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
        prOt = 1;
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
        prOt = 1;
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
        prOt = 1;
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
        prOt = 1;
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
        prOt = 2;
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
        prOt = 1;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 2;
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
        prOt = 1;
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
        prOt = 1;
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
        prOt = 1;
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
        prOt = 1;
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
        prOt = 2;
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
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a2b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO3() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a3a);
        t1.setTextColor(Color.MAGENTA);
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
    }

    public void PO6() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a6a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a6b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO7() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a7a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a7b);
        t2.setTextColor(Color.MAGENTA);
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
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a9b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO10() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a10a);
        t1.setTextColor(Color.MAGENTA);
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
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a13b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO14() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a14a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a14b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO15() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a15a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a15b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO16() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a16a);
        t1.setTextColor(Color.MAGENTA);
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
    }

    public void PO21() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a21a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a21b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO22() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a22a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a22b);
        t2.setTextColor(Color.MAGENTA);
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
    }

    public void PO26() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a26a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a26b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO27() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a27a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a27b);
        t2.setTextColor(Color.MAGENTA);
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
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a32b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO33() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a33a);
        t1.setTextColor(Color.MAGENTA);
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
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a35b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO36() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a36a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO37() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a37a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a37b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO38() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a38a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a38b);
        t2.setTextColor(Color.MAGENTA);
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
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a40b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO41() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a41a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a41b);
        t2.setTextColor(Color.MAGENTA);
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
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a44b);
        t2.setTextColor(Color.MAGENTA);
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
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a47b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO48() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a48a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a48b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO49() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a49a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a49b);
        t2.setTextColor(Color.MAGENTA);
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
    }

    public void PO52() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a52a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a52b);
        t2.setTextColor(Color.MAGENTA);
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
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a54b);
        t2.setTextColor(Color.MAGENTA);
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
    }

    public void PO57() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a57a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a57b);
        t2.setTextColor(Color.MAGENTA);
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
    }

    public void PO67() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a67a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO68() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a68a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO69() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a69a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO70() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a70a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO71() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a71a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a71b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO72() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a72a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO73() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a73a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a73b);
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
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a77b);
        t2.setTextColor(Color.MAGENTA);
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
        t1.setText(a80a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO82() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a82a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a82b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO83() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a83a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a83b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO84() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a84a);
        t1.setTextColor(Color.MAGENTA);
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a84b);
        t2.setTextColor(Color.MAGENTA);
    }

    public void PO85() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a85a);
        t1.setTextColor(Color.MAGENTA);
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
    }

    public void PO88() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a88a);
        t1.setTextColor(Color.MAGENTA);
    }

    public void PO89() {
        TextView t1 = (TextView) findViewById(R.id.tv5);
        t1.setText(a89a);
        t1.setTextColor(Color.MAGENTA);
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
        TextView t2 = (TextView) findViewById(R.id.tv6);
        t2.setText(a92b);
        t2.setTextColor(Color.MAGENTA);
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

        }
        if (x1 > 94) {
            x1 = 0;
        }

    }

    public void Vop2(){ TextView t = (TextView) findViewById(R.id.tv2);
        t.setText("Сколько в приложении местоимений?");
        t.setTextColor(Color.RED);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mesto);

        //Запрет поворота экрана
        setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

       Vop2();

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
                A1();
                break;
        }
        if (x > 94) {
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
