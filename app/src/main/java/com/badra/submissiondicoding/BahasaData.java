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
            },
            {       "C",
                    "Bahasa Pemograman C",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/The_C_Programming_Language_logo.svg/564px-The_C_Programming_Language_logo.svg.png",
                    " C / C ++ seperti roti dan mentega pemrograman. Hampir semua sistem level rendah seperti sistem operasi, sistem file, dll ditulis dalam C / C ++. Jika Anda ingin menjadi programmer tingkat sistem, C / C ++ adalah bahasa yang harus Anda pelajari. C ++ juga banyak digunakan oleh programmer kompetitif karena fakta bahwa itu sangat cepat dan stabil. C ++ juga menyediakan sesuatu yang disebut STL – Standard Template Library. STL adalah kumpulan pustaka yang siap digunakan untuk berbagai struktur data, operasi aritmatika, dan algoritma. Dukungan perpustakaan dan kecepatan bahasa menjadikannya pilihan populer di komunitas perdagangan frekuensi tinggi juga"
            },
            {       "GO",
                    "GO Programming Language",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Go_gopher_app_engine_bw.jpg/800px-Go_gopher_app_engine_bw.jpg",
                    "Go, juga dikenal sebagai Golang, adalah bahasa pemrograman yang dibangun oleh Google. Go menyediakan dukungan luar biasa untuk multithreading dan, itu digunakan oleh banyak perusahaan yang sangat bergantung pada sistem terdistribusi. Go banyak digunakan dalam startup di Silicon Valley. Namun, itu belum diadopsi oleh perusahaan / startup India. Mereka yang ingin bergabung dengan startup berbasis Valley yang berspesialisasi dalam sistem inti harus menguasai Golang."
            },
            {       "R",
                    "R Programming Language",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Font_Awesome_5_brands_r-project.svg/512px-Font_Awesome_5_brands_r-project.svg.png",
                    "R programming language  adalah salah satu bahasa pemrograman yang paling umum digunakan untuk Analisis Data dan Pembelajaran Mesin. R menyediakan kerangka kerja yang sangat baik dan perpustakaan bawaan untuk mengembangkan algoritma Machine Learning yang kuat. R juga digunakan untuk komputasi statistik umum dan juga grafik. R telah diadopsi dengan baik oleh perusahaan. Mereka yang ingin bergabung dengan tim “Analisis” dari sebuah organisasi besar harus benar-benar belajar R."
            },
            {       "Swift",
                    "Swift Programming Language",
                    "https://commons.wikimedia.org/wiki/File:Swift_logo.svg",
                    "Swift adalah bahasa pemrograman yang digunakan untuk mengembangkan aplikasi iOS. Perangkat berbasis iOS menjadi semakin populer. Apple iPhone, misalnya, telah merebut pangsa pasar yang signifikan dan memberikan persaingan yang ketat untuk Android. Oleh karena itu, mereka yang ingin melayani komunitas ini dapat mempelajari pemrograman Swift."
            },
            {       "Matlab",
                    "MatlabProgramming Language",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Matlab_Logo.png/667px-Matlab_Logo.png",
                    "MATLAB adalah alat analisis statistik yang digunakan di berbagai industri untuk Analisis Data. MATLAB digunakan secara luas dalam Visi Komputer dan industri pemrosesan Gambar juga."
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
