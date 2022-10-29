package com.example.recycleview;

import java.util.ArrayList;

public class DataBerita {
    private static String[] title = {
            "Kenali Undertone kulitmu untuk mempermudah dalam memilih kosmetik",
            "Kenapa Sih Harus Pakai Sunscreen Setiap Hari?",
            "Manfaat Masker Wajah dan Mengapa Kita Harus Rutin Menggunakannya",
            "Serum Vitamin C, Kapan Sebaiknya Digunakan?",
            "Benarkah Tea Tree Oil adalah Bahan Skincare Sarat Manfaat?",
            "Ceramide Moisturizer: Solusi untuk Perbaiki Skin Barrier"
    };
    private static String[] description = {
            "Apa itu Undertone Kulit?\n" +
                    "Undertone kulit adalah warna dasar kulit yang Anda miliki sejak lahir. Undertone kulit tidak bisa berubah seperti hal nya skin tone. Skin tone bisa saja berubah karena dipengaruhi oleh pemakaian kosmetik, scrub, hand body, dan produk kecantikan lainya, sedangkan undertone kulit tidak bisa berubah karena hanya dipengaruhi oleh faktor genetik atau keturunan.\n" +
                    "\n" +
                    "Mengetahui undertone kulit sangat penting bagi Anda agar kosmetik, pakaian, dan perhiasan yang Anda pakai cocok dengan warna kulit Anda. Menentukan warna undertone kulit memang tidak mudah, tetapi bisa Anda coba melalui beberapa cara di bawah ini. \n" +
                    "\n" +
                    "ara menentukan undertone kulit\n" +
                    "Undertone kulit manusia pada umumnya terbagi menjadi tiga kategori, yaitu warna warm, cool dan netral. Lalu bagaimana cara menentukanya? Salah satu caranya Anda bisa melihat warna urat nadi Anda, jika berwarna kehijauan berarti Anda memiliki undertone kulit warm. Adapun warna biru keunguan untuk undertone kulit cool dan jika Anda sulit untuk membedakan keduanya, bisa jadi undertone kulit Anda adalah netral. Jika Anda masih bingung untuk membedakanya, adapun beberapa cara lain yang bisa Anda coba di antaranya:\n" +
                    "\n" +
                    "Paparan sinar matahari\n" +
                    "Melalui paparan sinar matahari Anda bisa melihat perubahan warna kulit yang terjadi pada anggota tubuh Anda, Jika Anda memiliki undertone kulit warm, maka kulit Anda akan berubah kecoklatan setelah terpapar sinar matahari. Adapun warna kemerah-merahan bisa terjadi pada Anda yang memiliki undertone kulit cool, sedangkan undertone kulit netral sulit untuk dibedakan dari keduanya. \n" +
                    "\n" +
                    "Perhiasan\n" +
                    "Selain melalui paparan sinar matahari, undertone kulit juga bisa Anda kenali melalui perhiasan yang Anda pakai. Wanita yang memiliki undertone kulit warm biasanya akan terlihat cocok jika memakai perhiasan berwarna gold, sedangkan perak akan lebih cocok bagi wanita yang memiliki undertone kulit cool. Adapun mereka yang cocok memakai keduanya ialah mereka yang memiliki undertone kulit netral. \n" +
                    "\n" +
                    "Kecocokan warna pakaian\n" +
                    "Cara menentukan undertone kulit selanjutnya, ialah melalui warna pakaian yang Anda pakai. Anda bisa mencoba memakai pakaian berwarna merah, kuning atau hijau di hadapan cermin, jika Anda terlihat cocok memakai ketiga warna itu maka bisa dipastikan Anda memiliki undertone kulit warm. Namun jika Anda memiliki undertone kulit cool maka Anda akan terlihat cocok memakai warna pakaian berwarna biru, emas dan ungu. Jika Anda cocok memakai semua warna pakaian maka Anda memiliki undertone kulit netral. \n" +
                    "\n" +
                    "Melihat bagian belakang telinga\n" +
                    "Cara ini bisa Anda coba dengan meminta bantuan orang lain untuk melihat warna pada kulit di belakang telinga Anda. Jika terlihat berwarna kuning maka Anda memiliki undertone kulit warm dan warna kemerah-merahan untuk Anda yang memiliki undertone kulit cool, sedangkan undertone kulit netral sulit untuk dibedakan ",
            "Terkena sinar UV, alias sinar matahari selain bisa membuat kulit terbakar juga bisa menyebabkan kanker kulit. Nah, salah satu cara efektif untuk mencegah kerusakan kulit adalah dengan pakai sunscreen. \n" +
                    "\n" +
                    "\n" +
                    "Sebenarnya, apa sih sunscreen itu? \n" +
                    "\n" +
                    "Sunscreen adalah produk perawatan kulit berbentuk losion, spray, gel, foam, atau stick yang dapat digunakan untuk melindungi kulit dari radiasi sinar UV, baik UVA maupun UVB.\n" +
                    "\n" +
                    "Meski UVA dan UVB sama-sama buruk bagi kulit, sinar UVA menimbulkan dampak kerusakan yang lebih parah karena bisa menembus bagian terdalam kulit Anda. Bayangkan saja, radiasi sinar UVA dapat menembus awan dan kaca, baik itu pada siang, malam, bahkan ketika cuaca sedang mendung. Sinar UVA dapat mempercepat penuaan kulit serta menyebabkan keriput dan flek hitam.\n" +
                    "\n" +
                    "Sementara sinar UVB (Ultraviolet-Burning) merupakan sinar matahari yang memiliki panjang gelombang lebih kecil dari sinar UVA. Sinar UVB tidak menembus kaca dan awan, tapi radiasinya jauh lebih kuat daripada UVB. Terkena sinar UVB sebentar saja dapat menyebabkan kulit terbakar (sunburn).\n" +
                    "\n" +
                    "Jika kulit sering terkena radiasi kedua sinar tersebut, risikoAnda terkena kanker kulit pun kian besar.\n" +
                    "\n" +
                    "Jenis-jenis sunscreen\n" +
                    "cara kerja sunblock\n" +
                    "\n" +
                    "Berdasarkan bahan yang digunakannya, sunscreen dikategorikan menjadi dua jenis, yaitu:\n" +
                    "\n" +
                    "Sunscreen physical\n" +
                    "Bekerja dengan cara membuat suatu lapisan di permukaan kulit sehingga mampu menghalangi sinar UV agar tidak menembus lapisan kulit bagian dalam. Sunscreen ini biasanya mengandung bahan aktif seperti zinc oxide dan titanium dioxide.\n" +
                    "\n" +
                    "Sunscreen chemical\n" +
                    "Bekerja dengan cara membuat suatu lapisan di permukaan kulit untuk menyerap energi radiasi UV, sehingga tidak sampai terserap atau masuk ke lapisan kulit bagian dalam. Sunscreen chemical mengandung beberapa bahan aktif seperti cinnamates, octisalate, ovybenzone, dioxybenzone. Sunscreen jenis ini yang sering disebut sebagai sunblock.\n" +
                    "\n" +
                    "Kebanyakan formulasi sunscreen yang dijual di pasaran merupakan kombinasi dari physical dan chemical.\n" +
                    "\n" +
                    "Beda sunscreen dan sunblock\n" +
                    "Sunblock, istilah yg kurang tepat karena tidak ada satupun kandungan di dalamnya yang dapat memblok sinar uv. Bahkan, di Amerika, penggunaan kata sunblock sebenarnya sudah dilarang oleh FDA, instansi yang setara dengan Badan POM di Indonesia.\n" +
                    "\n" +
                    "Jadi, istilah penggunaan kata sunblock sudah digunakan lagi, karena lebih tepat memakai istilah sunscreen.\n" +
                    "\n" +
                    "Pentingnya pakai sunscreen setiap hari\n" +
                    "cara mengecilkan pori pori wajah\n" +
                    "\n" +
                    "Efek paparan sinar UV bisa dirasakan dalam jangka pendek maupun jangka panjang.\n" +
                    "\n" +
                    "Beberapa dampak jangka pendek meliputi:\n" +
                    "\n" +
                    "Terbakar matahari (sunburn)\n" +
                    "Kulit gelap\n" +
                    "Kulit hitam\n" +
                    "Kulit kusam\n" +
                    "Sementara dampak jangka panjang meliputi:\n" +
                    "\n" +
                    "Penuaan kulit\n" +
                    "Kulit keriput\n" +
                    "Kulit kendur/tidak kencang\n" +
                    "Muncul bercak-bercak kecoklatan atau flek hitam\n" +
                    "Bahkan, risiko kanker kulit \n" +
                    "Jika Anda tak mau mengalami berbagai dampak di atas, maka jangan lupa pakai sunscreen setiap hari, terutama saat sedang beraktivitas di luar ruangan. Tak hanya orang dewasa saja, bayi pun sebaiknya juga dioleskan sunscreen setiap kali ketika akan dibawa keluar rumah. Namun, penggunaan sunscreen direkomendasikan pada bayi di atas usia 6 bulan.",
            "Menggunakan masker wajah tidak hanya membuat kulit menjadi lebih lembut dan sehat, namun juga membantu kamu lebih rileks. Kamu bisa menikmati waktu bersantai sambil menggunakan masker wajah. Kegiatan ini akan membantu kamu menghilangkan stres serta membuat kulit terlihat dan terasa lebih baik. \n" +
                    "\n" +
                    "Masih belum yakin akan manfaat masker wajah? Simak beberapa alasan mengapa kamu harus rutin menggunakan masker wajah berikut ini!\n" +
                    "\n" +
                    "1. Menutrisi dan menghaluskan kulit wajah\n" +
                    "\n" +
                    "Sama seperti pelembap atau serum, masker wajah merupakan produk perawatan yang mampu menutrisi dan menghaluskan kulit wajah. Terkandung vitamin, zat aktif, dan nutrisi yang sangat terkonsentrasi ke kulit untuk meningkatkan kesehatannya. Masker wajah mampu menciptakan penghalang fisik yang mengunci bahan-bahan bermanfaat, memungkinkan kulit menyerapnya lebih efisien. \n" +
                    "\n" +
                    "Masker wajah dirancang untuk digunakan dalam waktu singkat untuk memberikan kulit instant boost. Berbagai bahan alami yang umum digunakan untuk membuat produk masker wajah adalah aloe vera, tomat, mentimun, madu, kiwi, dan sebagainya. Untuk menghaluskan kulit, kamu bisa memakai produk masker chemical exfoliant seperti asam glikolat dan asam laktat yang bekerja mengangkat sel-sel mati yang menumpuk pada permukaan wajah. Hasilnya, kulit tampak lebih cerah dan terasa lebih halus.\n" +
                    "\n" +
                    "2. Melembapkan kulit wajah \n" +
                    "\n" +
                    "Masker wajah membawa kelembapan dan hidrasi untuk jenis kulit kering dan dehidrasi. Ini karena kandungan dalam masker dapat menembus hingga ke lapisan epidermis kulit. Alhasil, kulit wajah jadi lembut dan elastisitasnya pun meningkat. Saat kulit terhidrasi dan terjaga kelembapannya, akan lebih mudah bagi kamu untuk mengaplikasikan makeup dan mendapatkan hasil yang maksimal. Wajah yang lembap juga memberikan penampilan kulit yang lebih sehat dan tampak awet muda.\n" +
                    "\n" +
                    "Selain menawarkan hasil yang meningkatkan penampilan kulit secara keseluruhan, masker wajah juga bisa sangat terapeutik. Jika mengandung minyak esensial aromatik seperti mint, masker wajah dapat meningkatkan semangat kamu. \n" +
                    "\n" +
                    "3. Mendetoksifikasi kulit wajah\n" +
                    "\n" +
                    "Mendetoksifikasi kulit wajah bermanfaat membuang minyak berlebih dan racun pada kulit. Dengan rutin detoksifikasi, kamu akan memiliki kulit yang lebih sehat. Masker wajah mampu menjaga kesehatan kulit yang rentan masalah karena radikal bebas. Berfungsi mendetoksifikasi racun dari dalam kulit, masker dapat mencegah munculnya jerawat pada wajah sehingga wajah lebih bersih dan bebas masalah.\n" +
                    "\n" +
                    "4. Menghilangkan dan mencegah jerawat\n" +
                    "\n" +
                    "Gangguan pada kulit yang berhubungan dengan produksi minyak berlebih ini bisa diatasi dengan rutin memakai masker wajah. Masker wajah membantu mendetoksifikasi racun pada kulit sehingga membantu menghilangkan dan mencegah peradangan atau penyumbatan pada pori-pori kulit yang memicu timbulnya jerawat. \n" +
                    "\n" +
                    "Meskipun membersihkan kulit wajah setiap hari menggunakan sabun cuci muka membantu membersihkan kulit, menggunakan masker wajah yang tepat dapat memaksimalkan fungsi tersebut. Masker wajah yang baik dapat membantu mengeluarkan kotoran yang bersembunyi di bawah lapisan kulit atas epidermis. Kulit yang bersih tentunya berdampak positif terhadap hilangnya jerawat dan mencegahnya datang kembali.\n" +
                    "\n" +
                    "5. Menghilangkan komedo\n" +
                    "\n" +
                    "Komedo muncul akibat adanya minyak berlebih pada wajah yang menyumbat pori-pori. Jika pori-pori wajah kamu terasa tersumbat, kamu bisa menggunakan masker wajah untuk membantu mengatasi kadar minyak pada wajah. Rutin menggunakan masker wajah akan membuat tampilan pori-pori lebih kecil dan mengurangi timbulnya komedo.\n" +
                    "\n" +
                    "Masker wajah juga membantu menghilangkan penumpukan sel kulit mati sehingga menghasilkan kulit yang bersih dan bercahaya. Untuk kamu yang rentan terhadap komedo, exfoliating mask dapat mencegah sel kulit mati dan minyak terperangkap di pori-pori yang menyebabkan terbentuknya lebih banyak komedo. \n" +
                    "\n" +
                    "6. Mencegah penuaan dini\n" +
                    "\n" +
                    "Masker wajah memiliki manfaat anti penuaan. Masker terbaik yang bisa kamu gunakan untuk melindungi kulit dari penuaan dini dan mengurangi kerutan halus adalah hydrating mask yang diaplikasikan semalaman. Gunakan masker yang mengandung bahan-bahan seperti vitamin E, collagen, niacinamide, hyaluronic acid, vitamin C, dan alpha lipoic acid untuk menjaga keremajaan kulit.",
            "Serum vitamin C merupakan salah satu skincare yang dipakai banyak orang, khususnya kalangan wanita. Hal ini tak terlepas dari banyaknya manfaat vitamin C untuk kesehatan kulit, mulai dari mencerahkan, menyamarkan bintik hitam, sampai melindungi kulit dari kerusakan akibat sinar UV. Namun, sebenarnya bagaimana cara mengaplikasikan serum vitamin C dengan benar? Lalu, kapan sebaiknya serum tersebut digunakan? Simak penjelasannya dalam artikel ini, ya!\n" +
                    "\n" +
                    "Jangan Sampai Salah Urutan \n" +
                    "\n" +
                    "Selain dilihat dari waktunya, pemakaian serum vitamin C juga harus diperhatikan dalam urutan skincare routine. Jangan sampai kamu salah dalam mengurutkan skincare yang dipakai. Pemakaian serum vit C sebaiknya dilakukan setelah kamu memakai toner dan sebelum pelembap.\n" +
                    "\n" +
                    "Urutan pemakaian seperti ini bisa membuat pengaplikasian serum vit C jadi lebih maksimal. Perlu diketahui, urutan skincare yang salah bisa membuat produk-produk yang dipakai tidak bekerja dengan maksimal, bahkan bisa sampai merusak kulit. Jadi, sebelum memakai skincare, pastikan kamu sudah mengetahui aturan serta urutannya terlebih dahulu.\n" +
                    "\n" +
                    "Wajib Pakai Sunscreen!\n" +
                    "\n" +
                    "Meskipun serum vitamin C dipercaya mampu melindungi kulit dari paparan sinar matahari, bukan berarti kamu hanya perlu memakai serum vit C. Kamu tetap tidak boleh melewatkan penggunaan sunscreen dalam rangkaian skincare pagi hari.\n" +
                    "\n" +
                    "Vitamin C mungkin bisa meningkatkan sensitivitas kulit terhadap sinar matahari sehingga lebih mudah teriritasi. Karenanya, pastikan kamu memakai sunscreen setelah penggunaan serum vit C di pagi hari. Jangan lupa pilih sunscreen dengan SPF 30 atau lebih tinggi.\n" +
                    "\n" +
                    "Kandungan yang Harus Dihindari \n" +
                    "\n" +
                    "Serum vitamin C memang skincare yang bagus untuk kesehatan kulit. Namun, perlu diperhatikan bahwa ada beberapa bahan aktif yang tidak bisa dipakai bersamaan dengan serum vit C, seperti retinoid dan benzoyl peroxide. Selain itu, beberapa bahan aktif seperti AHA dan BHA juga tidak bisa dipakai bersamaan.\n" +
                    "\n" +
                    "Jika dipakai bersamaan, serum vitamin C tidak akan bekerja dengan maksimal, bahkan berpotensi menyebabkan iritasi pada kulit karena penggunaan asam yang terlalu berlebihan. Untuk menyiasati ini, kamu bisa mengatur waktu penggunaan keduanya. Misalnya memakai toner retinol pada malam hari, kemudian memakai serum vit C pada pagi hari.\n" +
                    "\n" +
                    "Pilih Serum yang Sesuai dengan Kondisi\n" +
                    "\n" +
                    "Satu hal penting terakhir yang harus diperhatikan ketika menggunakan serum vit C adalah kondisi kulit kamu. Pilihlah serum yang sesuai dengan kondisi kulit. Misalnya, jika memiliki kulit yang sensitif, kamu bisa memakai serum vit C yang memiliki konsentrat rendah.\n" +
                    "\n" +
                    "Namun, jika kulit kamu tidak sensitif, tidak ada salahnya untuk memakai serum dengan konsentrat yang lebih tinggi, seperti GARNIER Bright Complete Vitamin C 30x Booster Serum. Untuk mendapatkan hasil yang lebih maksimal, jangan lupa aplikasikan dengan konsisten, ya.\n",
            "Saat membeli skincare di pasaran, sering kali kita melihat atau mendengar soal tea tree oil. Minyak satu ini kerap menjadi bahan sebuah skincare dan dianggap ampuh untuk merawat kulit. Namun, sudah tahukah kamu sebetulnya tea tree oil itu adalah apa? Kalau belum, yuk simak penjelasan selengkapnya soal serba-serbi tea tree oil berikut ini!\n" +
                    "\n" +
                    "Apa Itu Tea Tree Oil?\n" +
                    "\n" +
                    "Tea tree oil adalah minyak pohon teh yang berasal dari sebuah tanaman asal Australia bernama melaleuca alternifolia. Disebut juga dengan minyak melaleuca, tea tree oil tidak berkaitan sama sekali dengan daun teh seduhan yang selama ini kita konsumsi. Jadi, jangan sampai mengira tea tree oil berasal dari daun teh, ya. Tea tree oil adalah kandungan dalam tanaman melaleuca alternifolia yang dianggap ampuh mengobati berbagai masalah kulit.\n" +
                    "\n" +
                    "Manfaat Tea Tree Oil untuk Kulit Wajah\n" +
                    "\n" +
                    "Setelah mengetahui apa itu tea tree oil, kamu juga wajib tahu soal manfaatnya untuk kesehatan kulit wajah. Di antaranya ialah sebagai berikut:\n" +
                    "\n" +
                    "1. Mengurangi produksi minyak berlebih\n" +
                    "\n" +
                    "Banyak orang memiliki masalah kulit yang disebabkan produksi minyak berlebihan. Akhirnya, wajah jadi lebih mudah berjerawat hingga iritasi. Tentu kamu ingin mengatasi masalah ini, bukan? Nah, tea tree oil mampu mengurangi produksi minyak berlebih berkat adanya kandungan antiseptik.\n" +
                    "\n" +
                    "2. Bantu mengobati jerawat\n" +
                    "\n" +
                    "Selain mengurangi produksi minyak berlebih, manfaat lain tea tree oil adalah ampuh mengatasi kulit berjerawat. Kandungan antiradang dan antimikroba yang dikandungnya diteliti mampu mengobati jerawat pada kulit. \n" +
                    "\n" +
                    "3. Mengatasi kulit merah dan meradang\n" +
                    "\n" +
                    "Manfaat selanjutnya yang dimiliki oleh tea tree oil adalah mampu mengatasi kulit yang merah dan meradang. Kandungan dalam tea tree oil dianggap ampuh mengatasi iritasi pada kulit yang membuatnya menjadi merah dan bahkan bengkak.\n" +
                    "\n" +
                    "4. Mengatasi kulit kering\n" +
                    "\n" +
                    "Mengatasi kulit kering juga bisa dilakukan dengan rutin memakai tea tree oil. Bahkan dalam pemakaian yang tepat, tea tree oil juga bisa digunakan untuk mengatasi masalah kulit seperti eksim.",
            "Ceramide moisturizer saat ini jadi salah satu skincare viral. Produk pelembap wajah dengan kandungan ceramide ini diklaim mampu menjaga kelembapan wajah hingga memperbaiki skin barrier. Siapa, sih, yang tidak tertarik dengan skincare yang mampu memperbaiki skincare barrier? Pastinya kamu pun penasaran dan ingin membuktikan sendiri klaim tersebut.\n" +
                    "\n" +
                    "Namun, benarkah ceramide dalam produk pelembap wajah atau moisturizer ini mampu memperbaiki skin barrier? Yuk, simak ulasan lengkapnya sekaligus rekomendasi produk yang dapat kamu coba!\n" +
                    "\n" +
                    "Mengenal ceramide\n" +
                    "\n" +
                    "Ceramide moisturizer yang ramai dibicarakan oleh kalangan beauty enthusiast maupun influencer ini sebenarnya adalah produk pelembap wajah dengan kandungan ceramide. Bahan dasar ceramide diambil dari nama jenis asam lemak, yakni lipid.\n" +
                    "\n" +
                    "Secara alami, ceramide dapat ditemukan pada sel kulit manusia karena tubuh kita memang memproduksinya. Akan tetapi, ceramide di dalam tubuh manusia akan cenderung berkurang seiring dengan berjalannya waktu. Maka dari itu, dibuatlah produk pelembap berbahan ceramide untuk kulit wajah.\n" +
                    "\n" +
                    "Ceramide di dalam tubuh memiliki banyak manfaat untuk kulit wajah. Salah satunya adalah menjaga kelembapan kulit agar tidak kering dan kusam. Asam lemak yang membentuk 50 persen lapisan epidermis ini pun mampu memperlambat tanda-tanda penuaan. Makanya, moisturizer ceramide jadi salah satu produk paling dicari karena dapat menyuplai ceramide ke kulit jika kadar ceramide alami dalam tubuh berkurang seiring bertambahnya usia.\n" +
                    "\n" +
                    "Cara memilih ceramide moisturizer\n" +
                    "\n" +
                    "Agar manfaat moisturizer ceramide lebih maksimal di kulit wajah kamu, maka pastikan memilih produk dengan tepat. Begini cara memilih pelembap berbahan ceramide untuk kulit wajah kamu:\n" +
                    "\n" +
                    "1. Pilih sesuai tipe kulit\n" +
                    "\n" +
                    "Tekstur pelembap wajah biasanya sangat variatif, ada yang cream hingga gel. Untuk itu, kamu harus menyesuaikan tekstur produk pelembap ini dengan tipe kulit. Pemilik kulit normal dan kombinasi bisa pakai moisturizer ceramide bertekstur lotion. Sedangkan bagi pemilik kulit kering, bisa pakai moisturizer bentuk cream. Sementara itu, pemilik kulit berminyak dan berjerawat bisa pakai tekstur gel. \n" +
                    "\n" +
                    "2. Cek kandungan ceramide di dalam moisturizer\n" +
                    "\n" +
                    "Ceramide moisturizer memang sudah pasti mengandung ceramide, namun kadarnya tidak bisa dipastikan sama atau dalam jumlah besar. Bisa jadi produk pelembap itu memang mengandung ceramide, namun bukan termasuk kandungan utama dalam jumlah besar. Makanya, saat kamu mau beli produk pelembap dengan ceramide, pastikan dulu kadar kandungannya agar manfaatnya bisa optimal pada kulit wajah.\n" +
                    "\n" +
                    "3. Pilih ceramide human type \n" +
                    "\n" +
                    "Pastikan saat kamu membeli produk pelembap berbahan ceramide, yang digunakan adalah ceramide human type. Ceramide human type dibuat menggunakan ragi dan mirip dengan ceramide asli yang diproduksi oleh kulit manusia. Ceramide human type ini juga paling efektif melembapkan kulit wajah, serta tidak menimbulkan efek samping. Sementara itu, jenis ceramide lainnya adalah natural type, similar type, dan plant type.\n"

    };

    private static int[] image = {
            R.drawable.undertone,
            R.drawable.sunscreen,
            R.drawable.masker,
            R.drawable.serum,
            R.drawable.tree,
            R.drawable.moist,

    };

    static ArrayList<Berita> getListData(){
        ArrayList<Berita> list = new ArrayList<>();
        for (int position = 0; position < title.length; position++){
            Berita berita = new Berita();
            berita.setTittle(title[position]);
            berita.setDesc(description[position]);
            berita.setImage(image[position]);
            list.add(berita);
        }
        return list;
    }
}
