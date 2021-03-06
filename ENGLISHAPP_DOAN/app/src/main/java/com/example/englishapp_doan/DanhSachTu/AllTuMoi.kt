package com.example.englishapp.DanhSachTu

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.englishapp.Database.BLTuMoi

class AllTuMoi(context: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int
) : BLTuMoi(context, name, factory, version) {
    fun add()
    {
        Insert_TuMoi("school","Trường học","Trường học\nHọc đường\nĐàn cá","He left school when he was sixteen")
        Insert_TuMoi("house","Nhà","Nhà\nChuồng","The house of God")
        Insert_TuMoi("go","Đi","Đi đến\nTrôi qua\nchạy(máy móc)","The machine goes by electricity")
        Insert_TuMoi("pink","Màu hồng","Màu hồng\nXiên\nghim\nTrang trí","Rose pink walls")
        Insert_TuMoi("sing","Hát","Hát\nReo\nKhai báo\nTố Giác","She sings well")
        Insert_TuMoi("angel","Thiên Thần","Thiên Thần\nThiên sứ\nThiên đạo cơ đốc","Mary is children are all angels")
        Insert_TuMoi("student","Sinh viên","Sinh viên\nHọc sinh(Mỹ)","a medical student")
        Insert_TuMoi("pig","Con lợn","Con lợn \nNgười bẩn thỉu\nNgười thô lỗ(Như lợn)","Don not be such a pig!")
        Insert_TuMoi("dog","Chó","Chó\nSói đực\nCáo đực\nKẻ đê tiện\nKẻ đáng khinh\n(v)Theo sát\nbám sát","not have a dog is chance")
        Insert_TuMoi("shark","Cá mập","Cá mập\nCá xám\nCá mập trắng\nĐồ lừa đảo\nđồ cá mập(từ xấu)","man-eating shark")
        Insert_TuMoi("swim","Bơi","Sự bơi\nDịp bơi","she swam her horse across the river")
        Insert_TuMoi("cry","Khóc"," Khóc\nGào\nLa\nKêu(động vật)\n Cũ","the child was crying for his mother")
        Insert_TuMoi("love","Tình yêu","Tình yêu\nTình thương \nNgười dễ thương\nNgười đáng yêu","love of [one is] country")
        Insert_TuMoi("pain","Nỗi đau","Nỗi đau\n(v) Làm đau \nLàm cho đau khổ","the pain of separation")
        Insert_TuMoi("peace","Hòa bình","Hòa bình\nYên bình \n(v)Giữ im lặng...","after a brief peace\nfighting broke out again")
        Insert_TuMoi("money","Tiền bạc","Tiền tệ\nTiền của","throw one is money about")
        Insert_TuMoi("smart","Thông minh","Khôn khéo\nNhanh\n(v) Đau nhói\nnhức nhối\n(n) Sự đau nhói\nsự nhức nhối","they are still smarting from their defeat in the final")
        Insert_TuMoi("skin","da","da bì\nvỏ\nmàng","the meta skin of an aircraft")
        Insert_TuMoi("smile","Cười","Nụ cười\nHơn hở\n(v) Bày tỏ ý kiến","with a cheerful smile on his face")
        Insert_TuMoi("sky","Bầu trời","Trời\n(v)Thể dục thể thao","the warm sunny skies of South Vietnam")
        Insert_TuMoi("human","Con người","Người\nBản tính cong người\nNhân tính","she will understand and forgive\nshe is really quite human")
        Insert_TuMoi("mother","Mẹ","Mẹ\n(v)Chăm sóc\nNuôi nấng(như người mẹ)","piglets mothered by a sow")
        Insert_TuMoi("father","Cha","Cha\nBố\nBa\nTổ tiên\nÔng tổ\nTu sĩ\nChúa trời…","from father to son")
        Insert_TuMoi("sad","Đang buồn ","Đang buồn\nTồi tệ\nRủi thay\nTiếc thay...","sad to say\nshe has not given us permission to do it")
        Insert_TuMoi("unemployed ","Thất nghiệp","Thất nghiệp\nKhông được sử dụng hữu ích...","unemployed wealth")
        Insert_TuMoi("matter","Vấn đề","Vấn đề\nsự việc\nChất\n Vật chất\n Chất mủ","I am going there tomorrow as a matter of fact")
        Insert_TuMoi("stupid","ngớ ngẩn","ngớ ngẩn\nngốc nghếch\nngu dốt\nKém thông minh...","this stupid car will not start")
        Insert_TuMoi("happy","Hạnh phúc","Hạnh phúc\nsung sướng\nvui vẻ\nmay mắn","he is in the happy position of never having to worry about money")
        Insert_TuMoi("sunset","Lúc mặt trời lặn","Lúc mặt trời lặn\nHoàng hôn\nCảnh hoàng hôn…","the beautiful sunsets in the desert")
        Insert_TuMoi("mistake","Ngộ nhận\nsai lầm","(v) Hiểu sai\nHiểu lầm\nNhầm lẫn","she is often mistaken for her twin sister")
        Insert_TuMoi("sick","ốm","Ốm\nBuồn nôn\nĐộc ác\nGây xúc phạm","a sick feeling in the stomach")
        Insert_TuMoi("moon","mặt trăng","mặt trăng\nvệ tinh\n(v) Đi thang thang vơ vẩn","stop mooning and get on with some work")
        Insert_TuMoi("reasion","lý do","lý trí\nlý lẽ\nlẽ phải\nphi lý","for reasons best known to himself\nhe drinks tea from a beer glass")
        Insert_TuMoi("life","Cuộc sống","cuộc sống\nsự sống\nsự sinh tồn…","the struggle for life")
        Insert_TuMoi("space","không gian","không gian\nkhoảng trống\nbãi đất\nvũ trụ\nkhoảng thời gian","the space between words")
        Insert_TuMoi("rain","mưa","mùa mưa\ntrút xuống như mưa...","there was a heavy rain during the night")
        Insert_TuMoi("unfortunate","bất hạnh","Bất hạnh\nkhông may\nđáng tiếc\nngười bất hạnh","I was unfortunate enough to lose my keys")
        Insert_TuMoi("accident","tai nạn","tai nạn\ndịp may\ntình cờ…","Be killed in a car accident")
        Insert_TuMoi("confidence","sự tin","sự tin chắc\nquả quyết\n sự tự tin","the two girls sat in a corner exchanging confidences")
        Insert_TuMoi("memory","ký ức","trí nhớ\nsự tưởng niệm","he has a good memory for dates")
        Insert_TuMoi("old","già","già đi\ngià đời…","we had a larger garden at our old house")
        Insert_TuMoi("care","sự cẩn thận","sự chăm sóc\nnghĩa 2 sự lo âu\nsự lo lắng\n(v) để ý đến\nquan tâm đến;lo lắng đến","he failed the examination but he did not seem to care")
        Insert_TuMoi("fall","rơi","rơi\nbuông xuống\nđổ xuống\nquỵt xuống…","his supporters fell away as his popularity declined")
        Insert_TuMoi("lost","mất","mất tích\nlạc đường\n đã qua\n đã qua,đã để qua ","he was reading his book completely lost to the world")
        Insert_TuMoi("hungry","đói","thèm ăn\nkhát khao\ngây đói\nlàm cho đói","thousands are going hungry because of the failure of the harvest")
        Insert_TuMoi("cloud","mây"," mây\nmảng vẩn đục\nvết bẩn\nbóng mây","a cloud of suspicion is hanging over him")
        Insert_TuMoi("noise","tiếng ồn","ồn ào\nđồn\n…loan\nnhận xét…","she made polite noises about my work")
        Insert_TuMoi("kiss","hôn", "nụ hôn\ncái hôn\nđành vĩnh biệt","they kissed passionately when she arrived")
        Insert_TuMoi("hand","tay","tay\nviết tay…","lead somebody by the hand")
        Insert_TuMoi("soccer","bóng đá","đá banh…","he play soccer")
        Insert_TuMoi("die","chết","tử thần\nchết\nmất đi\ntắt đi\ntàn lụi đi","the secret will die with him")
        Insert_TuMoi("alive","sống","hoạt bát; nhanh nhẹn\ncòn sống\ncòn tồn tại\ncòn giá trị…","these train tickets are still alive")
        Insert_TuMoi("truth","sự thật"," sự thật\nchân lý…","there is no truth (not a word of truth) in what he says")
        Insert_TuMoi("lie","lừa dối","(n)Lời nói dối…","")
        Insert_TuMoi("anonymous","giấu tên","nặc danh…\nkhuyết danh","an anonymous benefactor")
        Insert_TuMoi("abandon","bỏ rơi","từ bỏ\nchìm đắm vào\nxúc động","We had to abandon the car")
        Insert_TuMoi("back","lùi"," lùi\nủng hộ\nđánh cược","He backs the car into the garage")
        Insert_TuMoi("box","cái hộp","cái hộp\nghế(tòa án,nhân chứng)\nphòng nhỏ\nmáy truyền hình","He ate a whole box of chocolates")
        Insert_TuMoi("bow","gật đầu(chào)","cúi gằm mặt xuống\nuốn cong","He bowed low to the assembled crowd")
        Insert_TuMoi("fast","nhanh"," nhanh\nchắc chắn\nkeo sơn","He made a boat fast")
        Insert_TuMoi("seal","hải cẩu","con dấu\nđiềm báo","Seal of death in one is face")
        Insert_TuMoi("set","đặt để","đặt để\nlấy bối cảnh\nsắp xếp","She set a tray down on table")
        Insert_TuMoi("earth","trái đất","mặt đất\nđất trồng\nhang(thú)","The history of life on earth")
        Insert_TuMoi("game","trò chơi","trò chơi\nván(bài,cờ)\ncon mồi","The children played a game of cops and robbers")
        Insert_TuMoi("green","xanh lục","xanh lục\nxanh tươi\nxanh(chưa chín)","Wait for the light to turn green")
        Insert_TuMoi("balk","làm thất bại kế hoạch","làm ai nản chí\nbỏ lỡ","He balk his father plan")
        Insert_TuMoi("carry","mang vác","chuyển\nmang lại\ntruyền bệnh","The veins carry blood to heart")
        Insert_TuMoi("compound","hợp chất","hợp chất\ntừ ghép\nbãi đất có hàng rào","A medicine compounded of herbs")
        Insert_TuMoi("launch","đưa ra","đưa ra\ngiới thiệu\nphóng","A party to launch his latest novel")
        Insert_TuMoi("picture","bức tranh","hình\nhình ảnh(truyền hình)","A picture of flowers hung on the wall")
        Insert_TuMoi("ask","hỏi"," hỏi\nđề nghị(xin,yêu cầu)\nmời","I ask to meet the manager")
        Insert_TuMoi("assembly","hội đồng","hội đồng\ncuộc họp\nsự lắp ráp","Morning assembly is held in the school hall")
        Insert_TuMoi("cut","cắt","cắt\ngiảm\nsự cắt bóng(thể thao)\nsự phớt lờ","a cut in prices")
        Insert_TuMoi("ring","cái nhẫn","cái nhẫn\nhình vòng\nquầng(mắt,trăng)","She had dark rings around her eyes from lack on sleep")
        Insert_TuMoi("turn","quay","quay\nvòng xoắn\nlàm thay đổi vị trí","The wheel of the car began to turn")
        Insert_TuMoi("jump","nhảy","nhảy\ntăng nhanh\nchuyển nhanh\nnhảy xổ vào","Prices jumped by 60% last year")
        Insert_TuMoi("level","mức độ","mức độ\nsan cho bằng\nngang(tài sức\ncân(bằng)","Are these pictures level?")
        Insert_TuMoi("containt","chứa đựng","chứa đựng\nkiềm chế\ncó thể chia hết(toán học)","This drink does not contain any alcohol")
        Insert_TuMoi("face","mặt","mặt\nhướng\nđương đầu","She has a long, thin face")
        Insert_TuMoi("mark","đánh dấu","đánh dấu\nlàm trầy xước\nmục đích\nbiểu hiện","The surfaces are made from a material that does not mark")
        Insert_TuMoi("sweep","quét","quét\nlướt\nlan nhanh","Sweep the floor")
        Insert_TuMoi("stray","đi lang thang","lạc đề\ncô lập\ntính khí","Stray dogs")
        Insert_TuMoi("dash","sự lao tới","sự lao tới\nmột chút\nchạy nước rút","When the doors opened, there was a mad dash for seats")
        Insert_TuMoi("deep","sâu","sâu\nkhó hiểu\nkhó hiểu\nthầm kín","Deep river")
        Insert_TuMoi("dismiss","gạt bỏ","gạt bỏ\nxua tan(tình cảm)\nbỏ không xét(pháp lý)"," She dismissed him with a wave of the hand ")
        Insert_TuMoi("false","sai","sai\nnhân tạo\ngiả tạo","false teeth")
        Insert_TuMoi("fancy","tưởng tượng","tưởng tượng\nthích làm\nmồi chài\nđều mường tượng\nrườm rà","She did not fancy the idea of going home in the dark")
        Insert_TuMoi("gate","cổng","cổng\ncửa đập\nhàng rào chắn\nhẽm núi","The crowd poured out through the gate")
        Insert_TuMoi("girdle","thắt lưng","thắt lưng\nsự bao quanh\nôm","He girdled her waist")
        Insert_TuMoi("glass","kính","kính\ncái ly\ngương soi","The bottle is made of glass")
        Insert_TuMoi("idea","ý nghĩ","ý nghĩ\nkhái niệm\nkế hoạch","He  already had an idea for his novel")
        Insert_TuMoi("imprint","dấu ấn ","dấu hằn\nphần ghi của nhà xuất bản","The imprint of a floot in the sand")
        Insert_TuMoi("indicate","cho thấy là","ngụ ý\ncho biết","Please indicate which free gift you would like to receive")
        Insert_TuMoi("keyboard","bàn phím","bàn phím\nbảng điều khiển\ntổng đài điện thoại","The width of piano keyboards became standard in the mid-1800s")
        Insert_TuMoi("knot","búi tóc","gút\nbúi tóc\nđám người túm lụm\nsự gồng người lên(vì giận)","She had her hair in a loose knot")
        Insert_TuMoi("lazy","lười biếng","chậm chạp\nuể oải","He is too lazy to walk to work.")
        Insert_TuMoi("light","ánh sáng","ánh sáng\nđèn\nánh long lanh","To turn the lights on")
        Insert_TuMoi("movement","sự vận động","cử động\nphong trào","He made a sudden movement and frightened the bird away")
        Insert_TuMoi("new","mới","mới\nkhác trước\nhiện đại","What is new in the fashion world?")
        Insert_TuMoi("happen","xảy ra","xảy ra\ntình cờ\ndiễn ra(như một hậu quả)","A funny thing happened in the office today")

    }

}