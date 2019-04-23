import org.junit.Assert;
import org.junit.Test;

public class PersonTest {



    @Test
    public void testCelebrateBirthday(){

        //Given
        Person birthdayLad = new Person();
        birthdayLad.setAge(3);
        Integer expectedAge = 4;



        //When
        birthdayLad.celebrateBirthday();
        Integer actualAge = birthdayLad.getAge();


        //Then
        Assert.assertEquals(expectedAge, actualAge);


    }


}
