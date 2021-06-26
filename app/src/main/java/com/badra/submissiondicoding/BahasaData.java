package com.badra.submissiondicoding;

import java.util.ArrayList;

public class BahasaData {
    public static String[][] data = new String[][]{
            {
                    "JavaScript",
                    "Bahasa Javascro[t",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/640px-Unofficial_JavaScript_logo_2.svg.png",
                    " Tidak mengherankan, selama delapan tahun berturut-turut, JavaScript telah mempertahankan bentengnya sebagai bahasa pemrograman yang paling umum digunakan. JavaScript dapat dipelajari dengan cepat dan mudah serta digunakan untuk berbagai tujuan, mulai dari meningkatkan fungsionalitas website, menyempurnakan tampilan dan sistem halaman website,  hingga mengaktifkan permainan dan software berbasis website. Sebagai bahasa yang digunakan untuk web developer, Javascript sering dijadikan sebagai salah satu syarat keahlian untuk profesi Front End Developer",
            },
            {
                    "SQL",
                    "Structured Query Language",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Sql_data_base_with_logo.png/640px-Sql_data_base_with_logo.png",
                    "Structured Query Language atau SQL adalah sebagai sebuah bahasa khusus yang digunakan ketika membuat maupun mengolah database dalam sebuah sistem. Profesi yang menangani bahasa ini biasanya adalah Back-End Developer dan Full Stack Developer",

            },
            {       "Python",
                    "Python Programming Language",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Lozingle_10032014.jpg/640px-Lozingle_10032014.jpg",
                    "Utsman bin Affan adalah sahabat nabi dan juga khalifah ketiga dalam Khulafaur Rasyidin. Beliau dikenal sebagai pedagang yang kaya raya dan handal dalam bidang ekonomi namun sangat dermawan",

            },
            {       "Java",
                    "Java Programming Language",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Java_20131025_1864663017.jpg/640px-Java_20131025_1864663017.jpg",
                    "Structured Query Language atau SQL adalah sebagai sebuah bahasa khusus yang digunakan ketika membuat maupun mengolah database dalam sebuah sistem. Profesi yang menangani bahasa ini biasanya adalah Back-End Developer dan Full Stack Developer"
            },
            {       "PHP",
                    "Hypertext PreProcessor",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/PHP-logo.svg/640px-PHP-logo.svg.png",
                    "PHP  atau Hypertext Preprocessor adalah sebuah bahasa pemrograman server side scripting yang bersifat open source. Secara umum, fungsi PHP adalah digunakan untuk pengembangan website. Di seluruh dunia sangat banyak website yang dibangun menggunakan PHP. Karena fleksibilitasnya yang tinggi, PHP juga bisa digunakan untuk membuat aplikasi komputer. PHP merupakan bahasa pemrograman yang bersifat open source. Pengguna bebas memodifikasi dan mengembangkan sesuai dengan kebutuhan"
            }
    };
    public static ArrayList<BahasaPemograman> getListData(){
        BahasaPemograman bahasa = null;
        ArrayList<BahasaPemograman> list = new ArrayList<>();
        for (int i = 0; i<data.length; i++){
            bahasa = new BahasaPemograman();
            bahasa.setName(data[i][0]);
            bahasa.setNote(data[i][1]);
            bahasa.setPhoto(data[i][2]);
            bahasa.setDesc(data[i][3]);


            list.add(bahasa);
        }

        return list;
    }
}
