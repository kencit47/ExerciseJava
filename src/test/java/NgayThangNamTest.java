import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NgayThangNamTest {
    @Test
    public void test_ngaythangnam(){
        assertEquals(new NgayThangNam().thuCuaNgay(19,05,2019),"Chu Nhat");
        assertEquals(new NgayThangNam().ngayConLaiCuaNam(19,05,2019),"226");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(19,05,2019),"12");

        assertEquals(new NgayThangNam().thuCuaNgay(1,1,1990),"Thu 2");
        assertEquals(new NgayThangNam().ngayConLaiCuaNam(1,1,1990),"364");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(1,1,1990),"30");

        assertEquals(new NgayThangNam().thuCuaNgay(25,7,1989),"Invalid date");
        assertEquals(new NgayThangNam().ngayConLaiCuaNam(25,7,1989),"Invalid date");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(25,7,1989),"Invalid date");

        assertEquals(new NgayThangNam().thuCuaNgay(5,2,3001),"Invalid date");
        assertEquals(new NgayThangNam().ngayConLaiCuaNam(5,2,3001),"Invalid date");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(5,2,3001),"Invalid date");
    }
}
