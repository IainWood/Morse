package com.example.led_changer;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

/**
*  MORSE 26 characters and 10 numerals
* A .-          N -.            1 .----
* B -...        O ---           2 ..---
* C -.-.        P .--.          3 ...--
* D -..         Q --.-          4 ....-
* E .           R .-.           5 .....
* F ..-.        S ...           6 -....
* G --.         T -             7 --...
* H ....        U ..-           8 ---..
* I ..          V ...-          9 ----.
* J .---        W .--           0 -----
* K -.-         X -..-
* L .-..        Y -.--
* M --          Z --..
* */

public class MainActivity extends AppCompatActivity {

    /**
     * The dot duration is the basic unit of time measurement in Morse code transmission. The
     * duration of a dash is three times the duration of a dot. Each dot or dash within a character
     * is followed by period of signal absence, called a space, equal to the dot duration. The
     * letters of a word are separated by a space of duration equal to three dots, and the words
     * are separated by a space equal to seven dots.
     *                          -Wikipedia
     */

    private static int dot;
    private static final int DASH = 3 * dot;
    private static final int PAUSE = dot;
    private static final int SEPARATE= 3 * dot;
    private static final int SPACE = 7 * dot;

    public static final String CHANNEL_ID_A = "channel_id_a";
    public static final String CHANNEL_ID_B = "channel_id_b";
    public static final String CHANNEL_ID_C = "channel_id_c";
    public static final String CHANNEL_ID_D = "channel_id_d";
    public static final String CHANNEL_ID_E = "channel_id_e";
    public static final String CHANNEL_ID_F = "channel_id_f";
    public static final String CHANNEL_ID_G = "channel_id_g";
    public static final String CHANNEL_ID_H = "channel_id_h";
    public static final String CHANNEL_ID_I = "channel_id_i";
    public static final String CHANNEL_ID_J = "channel_id_j";
    public static final String CHANNEL_ID_K = "channel_id_k";
    public static final String CHANNEL_ID_L = "channel_id_l";
    public static final String CHANNEL_ID_M = "channel_id_m";
    public static final String CHANNEL_ID_N = "channel_id_n";
    public static final String CHANNEL_ID_O = "channel_id_o";
    public static final String CHANNEL_ID_P = "channel_id_p";
    public static final String CHANNEL_ID_Q = "channel_id_q";
    public static final String CHANNEL_ID_R = "channel_id_r";
    public static final String CHANNEL_ID_S = "channel_id_s";
    public static final String CHANNEL_ID_T = "channel_id_t";
    public static final String CHANNEL_ID_U = "channel_id_u";
    public static final String CHANNEL_ID_V = "channel_id_v";
    public static final String CHANNEL_ID_W = "channel_id_w";
    public static final String CHANNEL_ID_X = "channel_id_x";
    public static final String CHANNEL_ID_Y = "channel_id_y";
    public static final String CHANNEL_ID_Z = "channel_id_z";
    public static final String CHANNEL_ID_SPACE = "channel_id_space";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        speedBar();

        //Creates all 36 channels, A-Z and 0-9
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel a_channel = new NotificationChannel(CHANNEL_ID_A, "Channel A", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel b_channel = new NotificationChannel(CHANNEL_ID_B, "Channel B", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel c_channel = new NotificationChannel(CHANNEL_ID_C, "Channel C", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel d_channel = new NotificationChannel(CHANNEL_ID_D, "Channel D", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel e_channel = new NotificationChannel(CHANNEL_ID_E, "Channel E", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel f_channel = new NotificationChannel(CHANNEL_ID_F, "Channel F", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel g_channel = new NotificationChannel(CHANNEL_ID_G, "Channel G", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel h_channel = new NotificationChannel(CHANNEL_ID_H, "Channel H", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel i_channel = new NotificationChannel(CHANNEL_ID_I, "Channel I", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel j_channel = new NotificationChannel(CHANNEL_ID_J, "Channel J", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel k_channel = new NotificationChannel(CHANNEL_ID_K, "Channel K", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel l_channel = new NotificationChannel(CHANNEL_ID_L, "Channel L", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel m_channel = new NotificationChannel(CHANNEL_ID_M, "Channel M", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel n_channel = new NotificationChannel(CHANNEL_ID_N, "Channel N", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel o_channel = new NotificationChannel(CHANNEL_ID_O, "Channel O", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel p_channel = new NotificationChannel(CHANNEL_ID_P, "Channel P", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel q_channel = new NotificationChannel(CHANNEL_ID_Q, "Channel Q", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel r_channel = new NotificationChannel(CHANNEL_ID_R, "Channel R", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel s_channel = new NotificationChannel(CHANNEL_ID_S, "Channel S", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel t_channel = new NotificationChannel(CHANNEL_ID_T, "Channel T", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel u_channel = new NotificationChannel(CHANNEL_ID_U, "Channel U", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel v_channel = new NotificationChannel(CHANNEL_ID_V, "Channel V", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel w_channel = new NotificationChannel(CHANNEL_ID_W, "Channel W", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel x_channel = new NotificationChannel(CHANNEL_ID_X, "Channel X", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel y_channel = new NotificationChannel(CHANNEL_ID_Y, "Channel Y", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel z_channel = new NotificationChannel(CHANNEL_ID_Z, "Channel Z", NotificationManager.IMPORTANCE_HIGH);
            NotificationChannel space_channel = new NotificationChannel(CHANNEL_ID_SPACE, "Channel Space", NotificationManager.IMPORTANCE_HIGH);

            //Sets the description (visible to the user in Settings>Notifications>App)
            a_channel.setDescription("A = .-");
            b_channel.setDescription("B = -...");
            c_channel.setDescription("C = -.-.");
            d_channel.setDescription("D = -..");
            e_channel.setDescription("E = .");
            f_channel.setDescription("F = ..-.");
            g_channel.setDescription("G = --.");
            h_channel.setDescription("H = ....");
            i_channel.setDescription("I = ..");
            j_channel.setDescription("J = .---");
            k_channel.setDescription("K = -.-");
            l_channel.setDescription("L = .-..");
            m_channel.setDescription("M = --");
            n_channel.setDescription("N = -.");
            o_channel.setDescription("O = ---");
            p_channel.setDescription("P = .--.");
            q_channel.setDescription("Q = --.-");
            r_channel.setDescription("R = .-.");
            s_channel.setDescription("S = ...");
            t_channel.setDescription("T = -");
            u_channel.setDescription("U = ..-");
            v_channel.setDescription("V = ...-");
            w_channel.setDescription("W = .--");
            x_channel.setDescription("X = -..-");
            y_channel.setDescription("Y = -.--");
            z_channel.setDescription("Z = --..");
            space_channel.setDescription("Provides length for a space");

            //Set the actual vibration tone for each letter (first argument is delay, then on, off, on, off, on... etc.)
            a_channel.setVibrationPattern(new long[]{0, dot, PAUSE, DASH});
            b_channel.setVibrationPattern(new long[]{0, DASH, PAUSE, dot, PAUSE, dot, PAUSE, dot});
            c_channel.setVibrationPattern(new long[]{0, DASH, PAUSE, dot, PAUSE, DASH, PAUSE, dot});
            d_channel.setVibrationPattern(new long[]{0, DASH, PAUSE, dot, PAUSE, dot});
            e_channel.setVibrationPattern(new long[]{0, dot});
            f_channel.setVibrationPattern(new long[]{0, dot, PAUSE, dot, PAUSE, DASH, PAUSE, dot});
            g_channel.setVibrationPattern(new long[]{0, DASH, PAUSE, DASH, PAUSE, dot});
            h_channel.setVibrationPattern(new long[]{0, dot, PAUSE, dot, PAUSE, dot, PAUSE, dot});
            i_channel.setVibrationPattern(new long[]{0, dot, PAUSE, dot});
            j_channel.setVibrationPattern(new long[]{0, dot, PAUSE, DASH, PAUSE, DASH, PAUSE, DASH});
            k_channel.setVibrationPattern(new long[]{0, DASH, PAUSE, dot, PAUSE, DASH});
            l_channel.setVibrationPattern(new long[]{0, dot, PAUSE, DASH, PAUSE, dot, PAUSE, dot});
            m_channel.setVibrationPattern(new long[]{0, DASH, PAUSE, DASH});
            n_channel.setVibrationPattern(new long[]{0, DASH, PAUSE, dot});
            o_channel.setVibrationPattern(new long[]{0, DASH, PAUSE, DASH, PAUSE, DASH});
            p_channel.setVibrationPattern(new long[]{0, dot, PAUSE, DASH, PAUSE, DASH, PAUSE, dot});
            q_channel.setVibrationPattern(new long[]{0, DASH, PAUSE, DASH, PAUSE, dot, PAUSE, DASH});
            r_channel.setVibrationPattern(new long[]{0, dot, PAUSE, DASH, PAUSE, dot});
            s_channel.setVibrationPattern(new long[]{0, dot, PAUSE, dot, PAUSE, dot});
            t_channel.setVibrationPattern(new long[]{0, DASH});
            u_channel.setVibrationPattern(new long[]{0, dot, PAUSE, dot, PAUSE, DASH});
            v_channel.setVibrationPattern(new long[]{0, dot, PAUSE, dot, PAUSE, dot, PAUSE, DASH});
            w_channel.setVibrationPattern(new long[]{0, dot, PAUSE, DASH, PAUSE, DASH});
            x_channel.setVibrationPattern(new long[]{0, DASH, PAUSE, dot, PAUSE, dot, PAUSE, DASH});
            y_channel.setVibrationPattern(new long[]{0, DASH, PAUSE, dot, PAUSE, DASH, PAUSE, DASH});
            z_channel.setVibrationPattern(new long[]{0, DASH, PAUSE, DASH, PAUSE, dot, PAUSE, dot});
            space_channel.setVibrationPattern(new long[]{SPACE});

            //create the channels, this can only be done once, so if there are updates to be made
            //then the app must be COMPLETELY uninstalled and reinstalled in order to update it... stupid.
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(a_channel);
            manager.createNotificationChannel(b_channel);
            manager.createNotificationChannel(c_channel);
            manager.createNotificationChannel(d_channel);
            manager.createNotificationChannel(e_channel);
            manager.createNotificationChannel(f_channel);
            manager.createNotificationChannel(g_channel);
            manager.createNotificationChannel(h_channel);
            manager.createNotificationChannel(i_channel);
            manager.createNotificationChannel(j_channel);
            manager.createNotificationChannel(k_channel);
            manager.createNotificationChannel(l_channel);
            manager.createNotificationChannel(m_channel);
            manager.createNotificationChannel(n_channel);
            manager.createNotificationChannel(o_channel);
            manager.createNotificationChannel(p_channel);
            manager.createNotificationChannel(q_channel);
            manager.createNotificationChannel(r_channel);
            manager.createNotificationChannel(s_channel);
            manager.createNotificationChannel(t_channel);
            manager.createNotificationChannel(u_channel);
            manager.createNotificationChannel(v_channel);
            manager.createNotificationChannel(w_channel);
            manager.createNotificationChannel(x_channel);
            manager.createNotificationChannel(y_channel);
            manager.createNotificationChannel(z_channel);
            manager.createNotificationChannel(space_channel);
        }
    }

    public void speedBar(){
        SeekBar speedBar = findViewById(R.id.speed_bar);
        TextView speedText = findViewById(R.id.speed_text_view);
        String one = "Speed: " + (speedBar.getProgress() * 10);
        speedText.setText(one);

        speedBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progressVal;
                    String progress = "Speed: " + (speedBar.getProgress() * 10);
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressVal = progress;
                        dot = progressVal * 10;
                        speedText.setText(progress);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        dot = progressVal * 10;
                        speedText.setText(progress);
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        dot = progressVal * 10;
                        speedText.setText(progress);
                    }
                }
        );
    }

    public void AButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_A)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(1, notification);
    }

    public void BButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_B)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(2, notification);
    }

    public void CButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_C)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(3, notification);
    }

    public void DButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_D)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(4, notification);
    }

    public void EButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_E)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(5, notification);
    }

    public void FButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_F)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(6, notification);
    }

    public void GButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_G)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(7, notification);
    }

    public void HButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_H)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(8, notification);
    }

    public void IButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_I)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(9, notification);
    }

    public void JButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_J)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(10, notification);
    }

    public void KButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_K)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(11, notification);
    }

    public void LButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_L)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(12, notification);
    }

    public void MButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_M)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(13, notification);
    }

    public void NButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_N)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(14, notification);
    }

    public void OButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_O)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(15, notification);
    }

    public void PButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_P)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(16, notification);
    }

    public void QButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_Q)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(17, notification);
    }

    public void RButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_R)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(18, notification);
    }

    public void SButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_S)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(19, notification);
    }

    public void TButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_T)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(20, notification);
    }

    public void UButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_U)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(21, notification);
    }

    public void VButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_V)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(22, notification);
    }

    public void WButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_W)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(23, notification);
    }

    public void XButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_X)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(24, notification);
    }

    public void YButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_Y)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(25, notification);
    }

    public void ZButton(View v){
        NotificationManagerCompat notificationManager;
        notificationManager = NotificationManagerCompat.from(this);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID_Z)
                .setSmallIcon(R.drawable.ic_blank)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build();

        notificationManager.notify(26, notification);
    }

    public void displayWord(View v){

        EditText wordEditText = findViewById(R.id.word_editText);
        String word = wordEditText.getText().toString().toUpperCase();
        String channelID;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'A'){
                channelID = CHANNEL_ID_A;
            } else if(word.charAt(i) == 'B'){
                channelID = CHANNEL_ID_B;
            } else if(word.charAt(i) == 'C'){
                channelID = CHANNEL_ID_C;
            } else if(word.charAt(i) == 'D'){
                channelID = CHANNEL_ID_D;
            } else if(word.charAt(i) == 'E'){
                channelID = CHANNEL_ID_E;
            } else if(word.charAt(i) == 'F'){
                channelID = CHANNEL_ID_F;
            } else if(word.charAt(i) == 'G'){
                channelID = CHANNEL_ID_G;
            } else if(word.charAt(i) == 'H'){
                channelID = CHANNEL_ID_H;
            } else if(word.charAt(i) == 'I'){
                channelID = CHANNEL_ID_I;
            } else if(word.charAt(i) == 'J'){
                channelID = CHANNEL_ID_J;
            } else if(word.charAt(i) == 'K'){
                channelID = CHANNEL_ID_K;
            } else if(word.charAt(i) == 'L'){
                channelID = CHANNEL_ID_L;
            } else if(word.charAt(i) == 'M'){
                channelID = CHANNEL_ID_M;
            } else if(word.charAt(i) == 'N'){
                channelID = CHANNEL_ID_N;
            } else if(word.charAt(i) == 'O'){
                channelID = CHANNEL_ID_O;
            } else if(word.charAt(i) == 'P'){
                channelID = CHANNEL_ID_P;
            } else if(word.charAt(i) == 'Q'){
                channelID = CHANNEL_ID_Q;
            } else if(word.charAt(i) == 'R'){
                channelID = CHANNEL_ID_R;
            } else if(word.charAt(i) == 'S'){
                channelID = CHANNEL_ID_S;
            } else if(word.charAt(i) == 'T'){
                channelID = CHANNEL_ID_T;
            } else if(word.charAt(i) == 'U'){
                channelID = CHANNEL_ID_U;
            } else if(word.charAt(i) == 'V'){
                channelID = CHANNEL_ID_V;
            } else if(word.charAt(i) == 'W'){
                channelID = CHANNEL_ID_W;
            } else if(word.charAt(i) == 'X'){
                channelID = CHANNEL_ID_X;
            } else if(word.charAt(i) == 'Y'){
                channelID = CHANNEL_ID_Y;
            } else if(word.charAt(i) == 'Z'){
                channelID = CHANNEL_ID_Z;
            } else if(word.charAt(i) == ' '){
                channelID = CHANNEL_ID_SPACE;
            } else{
                channelID = "blank";
            }

            NotificationManagerCompat notificationManager;
            notificationManager = NotificationManagerCompat.from(this);

            Notification letterNotification = new NotificationCompat.Builder(this, channelID)
                    .setSmallIcon(R.drawable.ic_blank)
                    .setPriority(NotificationCompat.PRIORITY_HIGH)
                    .build();

            notificationManager.notify(100, letterNotification);
            try {
                Thread.sleep(SEPARATE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
