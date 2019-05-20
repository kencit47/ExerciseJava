import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class NgayThangNamTest {
    @Test
    public void test_ngaythangnam(){
        assertEquals(new NgayThangNam().thuCuaNgay(19,05,2019),"Chu Nhat");
        assertEquals(new NgayThangNam().thuCuaNgay(21,05,2019),"Thu 3");
        assertEquals(new NgayThangNam().thuCuaNgay(22,05,2019),"Thu 4");
        assertEquals(new NgayThangNam().thuCuaNgay(23,05,2019),"Thu 5");
        assertEquals(new NgayThangNam().thuCuaNgay(24,05,2019),"Thu 6");
        assertEquals(new NgayThangNam().thuCuaNgay(25,05,2019),"Thu 7");
        assertEquals(new NgayThangNam().ngayConLaiCuaNam(19,05,2019),"226");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(19,05,2019),"12");

        assertEquals(new NgayThangNam().ngayConLaiCuaThang(19,02,2000),"10");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(19,02,2004),"10");

        assertEquals(new NgayThangNam().thuCuaNgay(1,1,1990),"Thu 2");
        assertEquals(new NgayThangNam().ngayConLaiCuaNam(1,1,1990),"364");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(1,1,1990),"30");

        assertEquals(new NgayThangNam().thuCuaNgay(25,7,1989),"Invalid date");
        assertEquals(new NgayThangNam().ngayConLaiCuaNam(25,7,1989),"Invalid date");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(25,7,1989),"Invalid date");

        assertEquals(new NgayThangNam().thuCuaNgay(5,2,3001),"Invalid date");
        assertEquals(new NgayThangNam().ngayConLaiCuaNam(5,2,3001),"Invalid date");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(5,2,3001),"Invalid date");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(0,0,1989),"Invalid date");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(32,13,3001),"Invalid date");
    }

    @Test
    public void test_dayOfMonth() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        NgayThangNam obj = new NgayThangNam();
        Method privateMethod = NgayThangNam.class.getDeclaredMethod("dayOfMonth", int.class, int.class);
        privateMethod.setAccessible(true);

        assertEquals((int) privateMethod.invoke(obj, 2, 2000),29);
        assertEquals((int) privateMethod.invoke(obj, 2, 2004),29);
        assertEquals((int) privateMethod.invoke(obj, 2, 2008),29);
        assertEquals((int) privateMethod.invoke(obj, 2, 2010),28);
        assertEquals((int) privateMethod.invoke(obj, 2, 2100),28);
    }
}
