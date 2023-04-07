package mypackage;

import org.example.DayUtility;
import org.mockito.Mockito;

import java.time.LocalDate;

public class Test
{
    //spy:
    private DayUtility dayUtility = Mockito.spy(new DayUtility());
    //private DayUtility dayUtility = Mockito.mock();

    //    @Test
    public void testCase1()
    {
        //Mon 1
        LocalDate loc = LocalDate.of(2023, 3, 27);
        System.out.println(dayUtility.getCurrentDay());
        Mockito.when(dayUtility.getCurrentDay()).thenReturn(loc);
//        Assertions.assertTrue(dayUtility.isDayOff());
        //Tue 2
        loc = LocalDate.of(2023, 3, 28);
        Mockito.when(dayUtility.getCurrentDay()).thenReturn(loc);
//        Assertions.assertTrue(dayUtility.isDayOff());

        //Wed 3
        loc = LocalDate.of(2023, 3, 29);
        System.out.println(dayUtility.getCurrentDay());
        Mockito.when(dayUtility.getCurrentDay()).thenReturn(loc);
//        Assertions.assertTrue(dayUtility.isDayOff());

        //Thu 4
        loc = LocalDate.of(2023, 3, 30);
        System.out.println(dayUtility.getCurrentDay());
        Mockito.when(dayUtility.getCurrentDay()).thenReturn(loc);
//        Assertions.assertTrue(dayUtility.isDayOff());

        //Fri 5
        loc = LocalDate.of(2023, 3, 31);
        System.out.println(dayUtility.getCurrentDay());
        Mockito.when(dayUtility.getCurrentDay()).thenReturn(loc);
//        Assertions.assertTrue(dayUtility.isDayOff());

        //sat 6
        loc = LocalDate.of(2023, 4, 1);
        System.out.println(dayUtility.getCurrentDay());
        Mockito.when(dayUtility.getCurrentDay()).thenReturn(loc);
//        Assertions.assertFalse(dayUtility.isDayOff());

        //Sun 7
        loc = LocalDate.of(2023, 4, 2);
        System.out.println(dayUtility.getCurrentDay());
        Mockito.when(dayUtility.getCurrentDay()).thenReturn(loc);
//        Assertions.assertFalse(dayUtility.isDayOff());
    }
}
