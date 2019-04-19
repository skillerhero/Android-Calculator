//This program was made by Rafael Leon Estrada, September 2018

 package estrada.leon.rafael.calculadora;

	

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;
    import android.widget.Toast;

    public class Calculadora extends AppCompatActivity implements View.OnClickListener {
        Button HEXButton, DECButton, OCTButton,BINButton,
                CEButton,ClearButton,BackSpaceButton,DivButton,
                AButton,BButton,SieteButton,OchoButton,NueveButton,MulButton,
                CButton,DButton,CuatroButton,CincoButton,SeisButton,MenosButton,
                EButton,FButton,UnoButton,DosButton,TresButton,MasButton,ExpButton,
                ExpCuadradoButton,MasMenosButton,CeroButton,PuntoButton,IgualButton,
                FactorialButton,SqrtButton,SenButton,CosButton,TanButton,PorcentajeButton;
        EditText Pantalla;
        TextView SistemaLabel,Anterior;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_calculadora);
            Pantalla=findViewById(R.id.Pantalla);
            SistemaLabel=findViewById(R.id.SistemaLabel);
            Anterior=findViewById(R.id.Anterior);
            HEXButton=findViewById(R.id.HEXButton);
            HEXButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    PuntoButton.setEnabled(false);
                    ExpCuadradoButton.setEnabled(false);
                    MasMenosButton.setEnabled(false);
                    PorcentajeButton.setEnabled(false);
                    FactorialButton.setEnabled(false);
                    ExpButton.setEnabled(false);
                    AButton.setEnabled(true);
                    BButton.setEnabled(true);
                    CButton.setEnabled(true);
                    DButton.setEnabled(true);
                    EButton.setEnabled(true);
                    FButton.setEnabled(true);
                    Conversiones conv = new Conversiones();
                    String HEX="HEX";
                    DECButton.setEnabled(true);
                    OCTButton.setEnabled(true);
                    BINButton.setEnabled(true);
                    HEXButton.setEnabled(false);
                    if(SistemaLabel.getText().equals("DEC")){
                        Pantalla.setText(conv.setDecHex(Double.valueOf(LeerP())));
                    }
                    if(SistemaLabel.getText().equals("BIN")){
                        Pantalla.setText(conv.setBinHex(LeerP()));
                    }
                    if(SistemaLabel.getText().equals("OCT")){
                        Pantalla.setText(conv.setOctHex(LeerP()));
                    }
                    SistemaLabel.setText(HEX);
                }
            });

            DECButton=findViewById(R.id.DECButton);
            DECButton.setEnabled(false);
            DECButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PuntoButton.setEnabled(true);
                    ExpCuadradoButton.setEnabled(true);
                    MasMenosButton.setEnabled(true);
                    PorcentajeButton.setEnabled(true);
                    FactorialButton.setEnabled(true);
                    ExpButton.setEnabled(true);
                    AButton.setEnabled(false);
                    BButton.setEnabled(false);
                    CButton.setEnabled(false);
                    DButton.setEnabled(false);
                    EButton.setEnabled(false);
                    FButton.setEnabled(false);
                    Conversiones conv = new Conversiones();
                    String DEC="DEC";
                    DECButton.setEnabled(false);
                    OCTButton.setEnabled(true);
                    BINButton.setEnabled(true);
                    HEXButton.setEnabled(true);
                    if(SistemaLabel.getText().equals("OCT")){
                        Pantalla.setText(conv.setOctDec(LeerP()));
                    }
                    if (SistemaLabel.getText().equals("BIN")){
                        Pantalla.setText(String.valueOf(conv.setBinDec(LeerP())));
                    }
                    if(SistemaLabel.getText().equals("HEX")){
                        Pantalla.setText(conv.setHexDec(LeerP()));
                    }
                    SistemaLabel.setText(DEC);
                }
            });
            OCTButton=findViewById(R.id.OCTButton);
            OCTButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PuntoButton.setEnabled(false);
                    ExpCuadradoButton.setEnabled(false);
                    MasMenosButton.setEnabled(false);
                    PorcentajeButton.setEnabled(false);
                    FactorialButton.setEnabled(false);
                    ExpButton.setEnabled(false);
                    AButton.setEnabled(false);
                    BButton.setEnabled(false);
                    CButton.setEnabled(false);
                    DButton.setEnabled(false);
                    EButton.setEnabled(false);
                    FButton.setEnabled(false);
                    String OCT="OCT";
                    Conversiones conv = new Conversiones();
                    DECButton.setEnabled(true);
                    OCTButton.setEnabled(false);
                    BINButton.setEnabled(true);
                    HEXButton.setEnabled(true);

                    if(SistemaLabel.getText().equals("DEC")){
                        Pantalla.setText(conv.setDecOct(Integer.parseInt(LeerP())));
                    }
                    else if(SistemaLabel.getText().equals("BIN"))
                    {
                        Pantalla.setText(conv.setBinOct(LeerP()));
                    }

                    if(SistemaLabel.getText().equals("HEX")){
                        Pantalla.setText(conv.setHexOct(LeerP()));
                    }
                    SistemaLabel.setText(OCT);
                }
            });
            BINButton=findViewById(R.id.BINButton);
            BINButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PuntoButton.setEnabled(false);
                    ExpCuadradoButton.setEnabled(false);
                    MasMenosButton.setEnabled(false);
                    PorcentajeButton.setEnabled(false);
                    FactorialButton.setEnabled(false);
                    ExpButton.setEnabled(false);
                    AButton.setEnabled(false);
                    BButton.setEnabled(false);
                    CButton.setEnabled(false);
                    DButton.setEnabled(false);
                    EButton.setEnabled(false);
                    FButton.setEnabled(false);
                    Conversiones conv = new Conversiones();
                    String BIN="BIN";
                    DECButton.setEnabled(true);
                    OCTButton.setEnabled(true);
                    BINButton.setEnabled(false);
                    HEXButton.setEnabled(true);
                    if (SistemaLabel.getText().equals("DEC")){
                        Pantalla.setText(conv.setDecBin(Double.valueOf(LeerP())));
                    }
                    if(SistemaLabel.getText().equals("OCT")){
                        Pantalla.setText(conv.setOctBin(LeerP()));
                    }
                    if(SistemaLabel.getText().equals("HEX")){
                        Pantalla.setText(conv.setHexBin(LeerP()));
                    }

                    SistemaLabel.setText(BIN);
                }
            });
            CEButton=findViewById(R.id.CEButton);
            CEButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText("0");
                }
            });
            ClearButton=findViewById(R.id.ClearButton);
            ClearButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Anterior.setText("0");
                    Pantalla.setText("0");
                }
            });
            CEButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText("0");
                }
            });
            BackSpaceButton=findViewById(R.id.BackSpaceButton);
            BackSpaceButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int tamañopantalla= LeerP().length();
                    Pantalla.setText(LeerP().substring(0,tamañopantalla-1));
                    if(LeerP().equals(""))
                        Pantalla.setText("0");
                }
            });
            DivButton=findViewById(R.id.DivButton);
            DivButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CharSequence anterior;
                    String texto1="";
                    int tamaño=String.valueOf(Anterior.getText()).length();
                    Double num1=0.0,num2=0.0,suma=0.0;

                    String texto2="";
                    if(Anterior.getText().equals("0"))
                    {
                        texto1=LeerP()+"/";
                        Anterior.setText(texto1);
                    }
                    else{
                        tamaño=String.valueOf(Anterior.getText()).length();
                        num1=Double.valueOf(String.valueOf((Anterior.getText().subSequence(0,tamaño-1))));
                        num2=Double.valueOf(LeerP());
                        suma=num1/num2;
                        texto2= suma+"/";
                        Anterior.setText(texto2);

                    }
                    Pantalla.setText("0");
                }
            });
            AButton=findViewById(R.id.AButton);
            AButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"A";
                    Pantalla.setText(text);
                }
            });
            BButton=findViewById(R.id.BButton);
            BButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"B";
                    Pantalla.setText(text);
                }
            });
            CButton=findViewById(R.id.CButton);
            CButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"C";
                    Pantalla.setText(text);
                }
            });
            DButton=findViewById(R.id.DButton);
            DButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"D";
                    Pantalla.setText(text);
                }
            });
            EButton=findViewById(R.id.EButton);
            EButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"E";
                    Pantalla.setText(text);
                }
            });
            FButton=findViewById(R.id.FButton);
            AButton.setEnabled(false);
            BButton.setEnabled(false);
            CButton.setEnabled(false);
            DButton.setEnabled(false);
            EButton.setEnabled(false);
            FButton.setEnabled(false);
            FButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"F";
                    Pantalla.setText(text);
                }
            });
            CeroButton=findViewById(R.id.CeroButton);
            CeroButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String text=LeerP() +"0";
                    if(LeerP().equals("0"))
                    {}else Pantalla.setText(text);
                }
            });
            UnoButton=findViewById(R.id.UnoButton);
            UnoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"1";
                    Pantalla.setText(text);
                }
            });
            DosButton=findViewById(R.id.DosButton);
            DosButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"2";
                    Pantalla.setText(text);
                }
            });
            TresButton=findViewById(R.id.TresButton);
            TresButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"3";
                    Pantalla.setText(text);
                }
            });
            CuatroButton=findViewById(R.id.CuatroButton);
            CuatroButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"4";
                    Pantalla.setText(text);
                }
            });
            CincoButton=findViewById(R.id.CincoButton);
            CincoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"5";
                    Pantalla.setText(text);
                }
            });
            SeisButton=findViewById(R.id.SeisButton);
            SeisButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"6";
                    Pantalla.setText(text);
                }
            });
            SieteButton=findViewById(R.id.SieteButton);
            SieteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"7";
                    Pantalla.setText(text);
                }
            });
            OchoButton=findViewById(R.id.OchoButton);
            OchoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"8";
                    Pantalla.setText(text);
                }
            });
            NueveButton=findViewById(R.id.NueveButton);
            NueveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(BorrarCero(LeerP()));
                    String text=LeerP()+"9";
                    Pantalla.setText(text);
                }
            });
            MulButton=findViewById(R.id.MulButton);
            MulButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CharSequence anterior;
                    String texto1="";
                    int tamaño=String.valueOf(Anterior.getText()).length();
                    Double num1=0.0,num2=0.0,suma=0.0;

                    String texto2="";
                    if(Anterior.getText().equals("0"))
                    {
                        texto1=LeerP()+"*";
                        Anterior.setText(texto1);
                    }
                    else{
                        tamaño=String.valueOf(Anterior.getText()).length();
                        num1=Double.valueOf(String.valueOf((Anterior.getText().subSequence(0,tamaño-1))));
                        num2=Double.valueOf(LeerP());
                        suma=num1*num2;
                        texto2= suma+"*";
                        Anterior.setText(texto2);

                    }
                    Pantalla.setText("0");
                }
            });
            MenosButton=findViewById(R.id.MenosButton);
            MenosButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String texto1="";
                    int tamaño=String.valueOf(Anterior.getText()).length();
                    Double num1=0.0,num2=0.0,suma=0.0;

                    String texto2="";
                    if(Anterior.getText().equals("0"))
                    {
                        texto1=LeerP()+"-";
                        Anterior.setText(texto1);
                    }
                    else{
                        tamaño=String.valueOf(Anterior.getText()).length();
                        num1=Double.valueOf(String.valueOf((Anterior.getText().subSequence(0,tamaño-1))));
                        num2=Double.valueOf(LeerP());
                        suma=num1-num2;
                        texto2= suma+"-";
                        Anterior.setText(texto2);

                    }
                    Pantalla.setText("0");
                }
            });
            MasButton=findViewById(R.id.MasButton);
            MasButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CharSequence anterior;
                    String texto1="";
                    int tamaño=String.valueOf(Anterior.getText()).length();
                    Double num1=0.0,num2=0.0,suma=0.0;

                    String texto2="";
                    if(Anterior.getText().equals("0"))
                    {
                        texto1=LeerP()+"+";
                        Anterior.setText(texto1);
                    }
                    else{
                        tamaño=String.valueOf(Anterior.getText()).length();
                        num1=Double.valueOf(String.valueOf((Anterior.getText().subSequence(0,tamaño-1))));
                        num2=Double.valueOf(LeerP());
                        suma=num1+num2;
                        texto2= suma+"+";
                        Anterior.setText(texto2);

                    }
                    Pantalla.setText("0");
                }
            });
            ExpButton=findViewById(R.id.ExpButton);
            ExpButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String pantalla=LeerP()+"^";
                    Anterior.setText(pantalla);
                    Pantalla.setText("0");
                }
            });
            ExpCuadradoButton=findViewById(R.id.ExpCuadradoButton);
            ExpCuadradoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Conversiones conv = new Conversiones();
                    Pantalla.setText(conv.elevarCuadrado(Double.valueOf(LeerP())));
                }
            });
            MasMenosButton=findViewById(R.id.MasMenosButton);
            MasMenosButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String texto="-"+Pantalla.getText();
                    if (String.valueOf(LeerP().charAt(0)).equals("-")){
                        Pantalla.setText(LeerP().substring(1,LeerP().length()));
                    }
                    else
                    {
                        Pantalla.setText(texto);
                    }
                }
            });
            PuntoButton=findViewById(R.id.PuntoButton);
            PuntoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String texto=LeerP()+".";
                    Pantalla.setText(texto);
                }
            });
            IgualButton=findViewById(R.id.IgualButton);
            IgualButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CharSequence anterior=Anterior.getText();
                    Conversiones conv = new Conversiones();
                    int tamaño=anterior.length();

                    if(anterior.subSequence(tamaño-1,tamaño).equals("^")){
                        Pantalla.setText(conv.elevar(Double.valueOf(Anterior.getText().subSequence(0,tamaño-1).toString()),Integer.parseInt(LeerP())));
                    }
                    if(anterior.subSequence(tamaño-1,tamaño).equals("%")){
                        Pantalla.setText(conv.porcentaje(Double.valueOf(LeerP()),Double.valueOf(String.valueOf(anterior).substring(0,tamaño-1))));
                    }
                    if(anterior.subSequence(tamaño-1,tamaño).equals("+")){
                        Pantalla.setText(String.valueOf(Double.valueOf(Double.valueOf(String.valueOf(anterior).substring(0,tamaño-1))+Double.valueOf(LeerP()))));
                    }
                    if(anterior.subSequence(tamaño-1,tamaño).equals("-")){
                        Pantalla.setText(String.valueOf(Double.valueOf(Double.valueOf(String.valueOf(anterior).substring(0,tamaño-1))-Double.valueOf(LeerP()))));
                    }
                    if(anterior.subSequence(tamaño-1,tamaño).equals("*")){
                        Pantalla.setText(String.valueOf(Double.valueOf(Double.valueOf(String.valueOf(anterior).substring(0,tamaño-1))*Double.valueOf(LeerP()))));
                    }
                    if(anterior.subSequence(tamaño-1,tamaño).equals("/")){
                        Pantalla.setText(String.valueOf(Double.valueOf(Double.valueOf(String.valueOf(anterior).substring(0,tamaño-1))/Double.valueOf(LeerP()))));
                    }

                    Anterior.setText("0");
                }
            });
            FactorialButton=findViewById(R.id.FactorialButton);
            FactorialButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Conversiones conv = new Conversiones();
                    Pantalla.setText(String.valueOf( conv.Factorial(Double.valueOf(LeerP()))));
                }
            });
            SqrtButton=findViewById(R.id.SqrtButton);
            SqrtButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(String.valueOf(Math.sqrt(Double.valueOf(LeerP()))));
                }
            });
            SenButton=findViewById(R.id.SenButton);
            SenButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(String.valueOf(Math.sin(Math.toRadians(Double.valueOf(LeerP())))));
                }
            });
            CosButton=findViewById(R.id.CosButton);
            CosButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(String.valueOf(Math.cos(Math.toRadians(Double.valueOf(LeerP())))));
                }
            });
            TanButton=findViewById(R.id.TanButton);
            TanButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pantalla.setText(String.valueOf(Math.tan(Math.toRadians(Double.valueOf(LeerP())))));
                }
            });
            PorcentajeButton=findViewById(R.id.PorcentajeButton);
            PorcentajeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String texto=LeerP()+"%";
                    Anterior.setText(texto);
                    Pantalla.setText("0");
                }
            });



        }

        @Override
        public void onClick(View e) {
            if(LeerP().substring(LeerP().length()-1).equals(".")& ((e.getId()!=(R.id.CeroButton))&
                    (e.getId()!=(R.id.UnoButton))&
                    (e.getId()!=(R.id.DosButton))&
                    (e.getId()!=(R.id.TresButton))&(e.getId()!=(R.id.CuatroButton))&
                    (e.getId()!=(R.id.CincoButton))&(e.getId()!=(R.id.SeisButton))&(e.getId()!=(R.id.SieteButton))&
                    (e.getId()!=(R.id.OchoButton))&(e.getId()!=(R.id.NueveButton))))
            {
                Pantalla.setText(LeerP().substring(0,LeerP().length()-2));
                if(LeerP().equals(""))
                    Pantalla.setText("0");
            }


        }

        public String BorrarCero(String original){
            if(original.equals("0"))
                original="";
            return original;
        }
        public String LeerP(){
            CharSequence p=Pantalla.getText();
            return String.valueOf(p);
        }



    }
