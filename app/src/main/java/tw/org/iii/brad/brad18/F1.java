package tw.org.iii.brad.brad18;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class F1 extends Fragment {
    private MainActivity mainActivity;
    private TextView lottery;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            if (view == null) {
                view = inflater.inflate(R.layout.fragment_f1, container, false);
                lottery = view.findViewById(R.id.page1_lottery);
                Button test1 = view.findViewById(R.id.page1_test1);
                test1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showLottery();
                    }
                });

                view.findViewById(R.id.page1_test2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mainActivity.changeTitle("Brad Big Company");
                    }
                });

            }
            return view;
    }

    public void showLottery(){
        lottery.setText("" + (int)(Math.random()*49+1)) ;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity)context;
    }
}
