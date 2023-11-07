package utils;

import android.inputmethodservice.KeyboardView;
import android.text.InputType;
import android.widget.EditText;

public class KeyBoardUtils {
    private KeyboardView KeyboardView;
    private EditText EditText;

    public KeyBoardUtils(android.inputmethodservice.KeyboardView keyboardView, android.widget.EditText editText) {
        KeyboardView = keyboardView;
        EditText = editText;
        this.EditText.setInputType(InputType.TYPE_NULL);//取消弹出系统键盘

    }
}
