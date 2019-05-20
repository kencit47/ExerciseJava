import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class NgayThangNamTest {
    @Test
    public void test_ngaythangnam(){
        assertEquals(new NgayThangNam().ngayConLaiCuaNam(19,05,2019),"226");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(19,05,2019),"12");

        assertEquals(new NgayThangNam().thuCuaNgay(25,7,1989),"Invalid date");
        assertEquals(new NgayThangNam().ngayConLaiCuaNam(25,7,1989),"Invalid date");
        assertEquals(new NgayThangNam().ngayConLaiCuaThang(25,7,1989),"Invalid date");
    }
    @Test
    public void test_thuCuaNgay() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        NgayThangNam obj = new NgayThangNam();
        Method privateMethod = NgayThangNam.class.getDeclaredMethod("thuCuaNgay", int.class, int.class, int.class);
        privateMethod.setAccessible(true);

        assertEquals( privateMethod.invoke(obj,20,05,2019),"Thu 2");
        assertEquals( privateMethod.invoke(obj,21,05,2019),"Thu 3");
        assertEquals( privateMethod.invoke(obj,22,05,2019),"Thu 4");
        assertEquals( privateMethod.invoke(obj,23,05,2019),"Thu 5");
        assertEquals( privateMethod.invoke(obj,24,05,2019),"Thu 6");
        assertEquals( privateMethod.invoke(obj,25,05,2019),"Thu 7");
        assertEquals( privateMethod.invoke(obj,26,05,2019),"Chu Nhat");
    }

    @Test
    public void test_checkDateValid() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        NgayThangNam obj = new NgayThangNam();
        Method privateMethod = NgayThangNam.class.getDeclaredMethod("checkDateValid", int.class, int.class, int.class);
        privateMethod.setAccessible(true);

        assertEquals( privateMethod.invoke(obj,5,2,3001),true);
        assertEquals( privateMethod.invoke(obj,5,2,1989),true);
        assertEquals( privateMethod.invoke(obj,0,2,2000),true);
        assertEquals( privateMethod.invoke(obj,32,5,2000),true);
        assertEquals( privateMethod.invoke(obj,5,0,2000),true);
        assertEquals( privateMethod.invoke(obj,5,13,2000),true);

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
