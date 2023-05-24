package com.dicoding.jetrestaurants.model

import com.dicoding.jetrestaurants.R

object FakeRestaurantDataSource {
    val dummyRestaurants = listOf(
        Restaurant(
            1,
            "Bring Your Phone Cafe",
            "Kamu bisa memilih tempat bersantap nyaman di dalam atau luar ruangan saat " +
                    "mengunjungi Bring Your Phone Cafe. Bring Your Phone Cafe memiliki beberapa " +
                    "cabang di Jakarta. Salah satunya berlokasi di Jalan Haji Agus Salim 128 " +
                    "Menteng, Jakarta Pusat. Restoran ini menawarkan beragam masakan khas " +
                    "Indonesia, seperti Chicken Satay Nusantara, Gulai Fish Head Tasik, Jimbaran " +
                    "Fried Fish, Sambal Udang Bukit Tinggi, Black Pepper Squid Malioboro, dan " +
                    "Daun Singkong Tumbuk. Selain itu, Bring Your Phone Cafe juga menjual " +
                    "Seafood Fried Rice Sunda Kelapa, Mie Jawa, Dawet Durian Banjar, Pisang " +
                    "Goreng Parahyangan, dan Singkong Gondo Arum. Makanan dan minuman di Bring " +
                    "Your Phone Cafe dijual dengan harga mulai Rp 20.000 hingga Rp 190.000 per " +
                    "porsi.",
            R.drawable.bring_your_phone_cafe,
            "Medan",
            4.6,
            "Jln. Belimbing Timur No. 27"
        ),
        Restaurant(
            2,
            "Run The Gun",
            "Run The Gun memiliki konsep tempat makan ala keraton Jawa berupa rumah " +
                    "Joglo yang dibuat kayu terbaik berusia 150 tahun. Tempat makan yang " +
                    "mendapat julukan Restoran Indonesia Terbaik di Jakarta oleh Tatler " +
                    "Indonesia menyediakan beragam masakan khas Nusantara yang cocok kamu santap " +
                    "bersama keluarga. Menu di Run The Gun di antaranya adalah Udang Nagih, Tahu " +
                    "Nenek, Asinan Sayur Betawi, Oyong Telur Puyuh, Nasi Goreng Kecombrang, Ayam " +
                    "Bakar Joglo, Sate Ayam, Rendang Sapi Singkong, Empal Cabe Ijo, dan Tumis " +
                    "Buncis Ayam. Restoran yang memiliki kapasitas hingga 200 tamu ini juga " +
                    "menyediakan pertunjukan budaya Indonesia dan musik yang ditampilkan pada " +
                    "waktu tertentu. Run The Gun berlokasi di Jalan Dharmawangsa Raya Nomor 6, " +
                    "Kebayoran Baru Jakarta Selatan.",
            R.drawable.run_the_gun,
            "Bali",
            4.6,
            "Jln. Pandeglang No. 19"
        ),
        Restaurant(
            3,
            "Pangsit Express",
            "Pangsit Express memiliki ruangan megah dan bersejarah yang sudah dibangun " +
                    "sejak 1914. Beberapa menu yang tersedia di Pangsit Express adalah " +
                    "Bitterballen, Sate Lembut Betawi, Gulai Iga Kambing, Ayam Goreng Lengkuas, " +
                    "Kuah Acar Ikan Blimbing Wuluh, Gado Gado Djakarta, Tempee Goreng Lengkuas, " +
                    "dan Nasi Goreng Nonya Old Recipe. Satu sajian khas Indonesia di Pangsit " +
                    "Express ditawarkan seharga Rp 24.000 hingga Rp 200.000-an. Tidak hanya " +
                    "menyantap hidangan lezat, kamu juga dapat menikmati karya seni kreatif dari " +
                    "dari seniman dunia di Tugu Kunstkring Paleis, seperti Vincent van Gogh, " +
                    "Pablo Picasso, Paul Gauguin, dan Marc Chagall. Pangsit Express yang " +
                    "berlokasi di Jalan Teuku Umar Nomor 1, Gondangdia, Menteng, Jakarta Pusat " +
                    "ini buka setiap hari mulai pukul 11.00-00.00 WIB.",
            R.drawable.pangsit_express,
            "Ternate",4.8,
            "Jln. Pustakawan No. 9"
        ),
        Restaurant(
            4,
            "Kafe Kita",
            "Kafe Kita menawarkan beragam menu khas Indonesia, seperti Sate Kambing " +
                    "Muda, Kakap Bakar Dabu-Dabu, Cumi Bakar Rica, Kerapu Bakar Jimbaran, " +
                    "Tongseng Sengkel, dan Sop Buntut. Selain itu, ada juga Sayur Lodeh Wagyu, " +
                    "Ongseng Kecipir, Lontong Laksa Seafood,  Nasi Goreng Buntut Bumbu Belacan, " +
                    "Mie Goreng, dan Nasi Goreng Kampung. Satu porsi menu di Kafe Kita dijual " +
                    "dengan harga mulai dari Rp 30.000 sampai dengan Rp 200.000-an.",
            R.drawable.kafe_kita,
            "Gorontalo",
            4.0,
            "Jln. Pisang Timur No. 27"
        ),
        Restaurant(
            5,
            "Kafein",
            "Kafein menyediakan masakan Indonesia asli serta desain ruang makan yang " +
                    "memiliki sentuhan kontemporer Jawa. Restoran yang mengambil nama dari " +
                    "permen kapas  ini menawarkan beragam menu manis layaknya harum manis. " +
                    "Beberapa menu di Kafein adalah Lapis Putri Ayu, Unti Ijo Celebes, Dieng Es " +
                    "Podeng, Pisang Goreng Putri Salju, Durian Brulle, dan Colenak Nyi Iteung. " +
                    "Selain itu, ada juga menu gurih, seperti Bihun Goreng Jawa, Rendang Bakar " +
                    "Tali Jiwo, Ayam Goreng Selimut Lengkuas, Ikan Gurame Bakar Genjeran, Nasi " +
                    "Rawon Pasar Turi, dan Nasi Campur Nusantara. Makanan dan minuman di Harum " +
                    "Manis dijual dengan harga mulai Rp 40.000 sampai dengan Rp 500.000-an.",
            R.drawable.kafein,
            "Jakarta",
            3.8,
            "Jln. Apel Selatan No. 27"
        ),
        Restaurant(
            6,
            "Makan Mudah",
            "Kamu bisa ajak ibu beserta keluarga untuk menyantap masakan khas " +
                    "Indonesia dengan suasana nyaman di Makan Mudah. Makan Mudah menyediakan " +
                    "beberapa ruang makan, seperti ruang depan, ruang makan elegan, ruang " +
                    "privat, serta ruang makan loteng yang dibatasi langsung dengan jendela " +
                    "besar. Menu di Agneya Restaurant di antaranya adalah Lontong Cap Go Meh, " +
                    "Dendeng Sapi Sambal Balado, Ayam Bakar Gurih Komplit, Jagung Goreng " +
                    "Keriting, Tahu Gejrot, Lumpia Goreng, dan Gado-gado. Makan Mudah terletak " +
                    "di Jalan Wijaya IX Nomor 23, Kebayoran Baru, Jakarta Selatan dan buka " +
                    "setiap hari mulai pukul 11.00-21.00 WIB.",
            R.drawable.makan_mudah,
            "Malang",
            4.6,
            "Jln. Rambutan No. 19"
        ),
        Restaurant(
            7,
            "Saya Suka",
            "Desain interior Saya Suka hampir sepenuhnya dibuat dari kayu serta " +
                    "tambahan dedaunan dan lampu yang memberi kesan nyaman bagi para tamu. Saya " +
                    "Suka menjual beragam masakan tradisional Indonesia yang bisa kamu nikmati " +
                    "bersama ibu dan keluarga. Menu Remboelan di antaranya adalah Bistik Ayam " +
                    "Renyah, Buncis Renyah Jimbaran, Cumi Lada Garam Nusa Penida, Gulai Kepala " +
                    "Ikan Putri Minang, Mie Rebus Pesisiran, Nasi Bakar Cumi Gurih, Empal " +
                    "Gentong Cirebon, Pindang Ikan Jawa, dan Gado Gado Semarang. Ada juga " +
                    "makanan penutup manis di Remboelan, seperti Malkis Tape Semarang, Roti " +
                    "Bakar Es Puter, Pisang Goreng, dan Roti Bakar Selai Kacang Susu. Salah satu " +
                    "cabang Remboelan berlokasi di Lotte Shopping Avenue Jalan Prof Dr Satrio " +
                    "Kavling 3-5 Lantai 3, Kuningan, Jakarta Selatan.",
            R.drawable.saya_suka,
            "Surabaya",
            3.6,
            "Jln. Naga No. 9"
        ),
        Restaurant(
            8,
            "Gigitan Cepat",
            "Fairy Cafe jadi salah satu tempat makan masakan Indonesia kelas premium " +
                    "yang lokasinya di tengah kota, yaitu daerah Sudirman. Meski tempatnya " +
                    "strategis, lokasi restoran mewah di Jakarta ini cukup tersembunyi, di " +
                    "bangunan yang terpisah di dalam Plaza Sentral. Kalau kamu penasaran, kata " +
                    "Fairy Cafe sebenarnya adalah bahasa zaman dulunya permen yang sekarang " +
                    "sudah jarang banget digunakan lagi. Interior restoran ini dipercantik " +
                    "dengan gaya kolonial dan berbagai pajangan antik yang bisa membuat kamu " +
                    "terpukau. Bagaimana dengan makanannya? Fairy Cafe menyajikan beragam " +
                    "hidangan Indonesia dengan sentuhan Belanda dan peranakan. Buat yang suka " +
                    "pedas, pasti kamu akan suka makan di Kembang Goela. Pasalnya, banyak menu " +
                    "mereka yang bercita rasa pedas, seperti Dendeng Balado dan Ayam Mevrouw " +
                    "Lientje yang super enak. Buat yang nggak suka pedas tapi tetap ingin " +
                    "merasakan makanan tersebut, bisa minta versi yang tidak terlalu pedas. Puas " +
                    "dengan main course, kamu bisa cobain snack khas Indonesia, seperti Pisang " +
                    "Gentjet dan Kue Jongkong. Suasana dan makanan di Kembang Goela bakal bikin " +
                    "kamu pengen balik lagi deh ke sana.",
            R.drawable.gigitan_cepat,
            "Aceh",
            4.0,
            "Jln. Jurang Timur No. 27"
        ),
        Restaurant(
            9,
            "Fairy Cafe",
            "Restoran mewah khas Indonesia yang satu ini menempati salah satu rumah " +
                    "peninggalan Belanda di Menteng. Pertama dibuka pada 2007. Tempatnya cantik " +
                    "banget sampai-sampai kamu bisa bergumam “wow” berkali-kali dari pertama " +
                    "menginjakkan kaki di Bunga Rampai. Tempat makan khas Indonesia ini tidak " +
                    "hanya terkenal di kalangan ekspat, tapi juga jadi salah satu restoran " +
                    "favorit kepala negara kita lho. Tiap area di Bunga Rampai punya dekorasi " +
                    "yang berbeda-beda, tapi tetap dalam satu tema besar yang sama: kolonial. " +
                    "Variasi masakannya sendiri terbatas pada hidangan Indonesia dan Belanda. " +
                    "Yang paling recommended di sini adalah Nasi Buketan, kamu bisa mencicipi " +
                    "beberapa makanan tradisional Indonesia, seperti sate daging, tempe, ayam, " +
                    "dan lain-lain dalam satu piring. Selain itu, ada juga Nasi Goreng Kampung " +
                    "Menteng yang dijamin bisa menggugah selera siapa pun. Buat hidangan " +
                    "penutupnya, pesan Es Bunga Rampai yang nggak akan bisa kamu temukan di " +
                    "mana-mana.",
            R.drawable.fairy_cafe,
            "Semarang",
            3.9,
            "Jln. Tiga No. 19"
        ),
        Restaurant(
            10,
            "Melting Pot",
            "Mau ngerasain suasana super romantis saat fine dining di restoran mewah di" +
                    "Jakarta khas Indonesia? Datanglah ke Melting Pot yang dulunya jadi tempat di" +
                    "mana Buddha Bar berdiri. Di sini tempat paling sempurna buat menikmati" +
                    "makanan Indonesia sambil mengagumi sejumlah karya seni yang umurnya sudah" +
                    "tua. Melting Pot menyulap bangunan tua peninggalan Belanda yang dulunya" +
                    "sempat jadi gedung imigrasi menjadi restoran legendaris dengan 7 ruang" +
                    "makan tematik yang luar biasa. Dijamin kamu nggak akan nyesel deh fine " +
                    "dining di sini. Untuk rasa makanan juga nggak perlu kuatir. Mereka " +
                    "menawarkan makanan Indonesia dengan nuansa peranakan. Salah satu menu yang " +
                    "cukup mewakilkan sajian di Melting Pot adalah Tugu Rijsttafel Betawi. Ada " +
                    "12 hidangan yang bisa kamu cicipi hanya dengan memesan satu menu ini.",
            R.drawable.melting_pot,
            "Tangerang",
            4.2,
            "Jln. Satu No. 9"
        )
    )
}