package com.example.user.clickedexceptionexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


/**
 * MainActivity.class
 * Activity를 상속 받고 있습니다.
 * Application이 동작하면 가장먼저 보여지는 UI에 대한 소스코드가 정의되어있습니다.
 */
public class MainActivity extends Activity {

    private Button exceptionButton;

    /**
     * MainActivity가 실행되면 첫번째로 작동하는 메서드 입니다.
     * activity_main.xml에 배치된 Button의 id를 멤버변수 exceptionButton에 할당 시켜줍니다.
     * exceptionButton을 Click하게되면 exceptionButtonClick 메서드가 작동합니다.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exceptionButton = (Button)findViewById(R.id.exceptionButton);

        exceptionButton.setOnClickListener(v -> exceptionButtonClick(null));
    }

    /**
     * exceptionButton을 Click하게되면 작동되는 메서드 입니다.
     * Exception 작동 주석 Head를 보시려면 @ExceptionHead 태그를 검색하세요
     */
    private <T>void exceptionButtonClick(T value) {
        try{

//            @ExceptionHead NullPointerException
//            System.out.println(value.toString());

//            @ExceptionHead ArrayIndexOutOfBoundsException
//            int[] strValues = new int[0];
//            strValues[0] = 0;

//            @ExceptionHead NumberFormatException
//            String beforeChangeStr = "abc";
//            int afterChangeInt = Integer.parseInt(beforeChangeStr);
//            System.out.println(afterChangeInt);


        }
        catch (NullPointerException e){
            Toast.makeText(getApplicationContext(), "NullPointerException", Toast.LENGTH_LONG).show();
        }
        catch (ArrayIndexOutOfBoundsException e){
            Toast.makeText(getApplicationContext(), "ArrayIndexOutOfBoundsException", Toast.LENGTH_LONG).show();
        }
        catch (NumberFormatException e){
            Toast.makeText(getApplicationContext(), "NumberFormatException", Toast.LENGTH_LONG).show();
        }

    }
}
