import java.util.Scanner;
class programfinal
{
	public static void main (String [] args)
	{
	Scanner pobierz = new Scanner(System.in);
	System.out.println("Wybierz, kt�r� funkcj� programu chcesz u�ywa�:");
	System.out.println("Kalkulator zdolno�ci kredytowej\t\t-\t[1]");
	System.out.println("Symulacja kredytu\t\t\t-\t[2]");
	String wybor = pobierz.next();
	while (!wybor.equals("1") && !wybor.equals("2"))
{
	System.out.println(" ");
	System.out.println("Wybrana zosta�a niepoprawna funkcja");
	System.out.println(" ");
	System.out.println("Wybierz, kt�r� funkcj� programu chcesz u�ywa�:");
	System.out.println("Kalkulator zdolno�ci kredytowej\t\t-\t[1]");
	System.out.println("Symulacja kredytu\t\t\t-\t[2]");
	wybor = pobierz.next();
}

	switch (wybor) {
case "1":{
	Scanner zdolnosc = new Scanner(System.in);
	System.out.println(" ");
	System.out.println("Witamy w kalkulatorze zdolno�ci kredytowej, kt�ry umo�liwia orientacyjne ustalenie wysoko�ci rat oraz kwoty kredytu ze wzgl�du na pare parametr�w.");
	System.out.println("Prosz� o podanie miesi�cznego doch�du gospodarstwa domowego netto");
	double a;


while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	a=zdolnosc.nextDouble();

        while (a<=0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Doch�d gospodarstwa domowego netto nie mo�e by� mniejszy, b�d� r�wny 0");
	System.out.println("Prosz� o podanie miesi�cznego doch�du gospodarstwa domowego netto"); 
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	a=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("W kolejnym kroku nale�y poda� okres kredytowania.");
	System.out.println("Podane lata oraz miesi�ce sumuj� si�, prosz� o podanie ca�kowitych warto�ci w obu przypadkach.");
	System.out.println("Podaj ilo�� lat kredytowania:");
	double b;

while (true) {
	while (!zdolnosc.hasNextDouble()){
	System.out.println(" ");	 
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	b=zdolnosc.nextDouble();

        while (b<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Ilo�� lat kredytowania nie mo�e by� mniejsza od 0");
	System.out.println("Podaj ilo�� lat kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	b=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj ilo�ci miesi�cy kredytowania:");
	double c;

while (true) {
	while (!zdolnosc.hasNextDouble()){
	System.out.println(" ");	 
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	c=zdolnosc.nextDouble();

        while (c<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Ilo�� miesi�cy kredytowania nie mo�e by� mniejsza od 0");
	System.out.println("Podaj ilo�ci miesi�cy kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	c=zdolnosc.nextDouble();}
break;}

	while ((int)b==0 && (int)c==0){
	System.out.println(" ");
	System.out.println("Suma lat oraz miesi�cy kredytowania jest r�wna 0");
	System.out.println(" ");
	System.out.println("Prosz� o podanie conajmniej jednej z tych warto�ci wi�kszej od 0");
	System.out.println("Podaj ilo�� lat kredytowania:");

while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta�a niepoprawna warto��");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	b=zdolnosc.nextDouble();

        while (b<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Ilo�� lat kredytowania nie mo�e by� mniejsza od 0");
	System.out.println("Podaj ilo�� lat kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println(" ");
		System.out.println("Wpisana zosta�a niepoprawna warto��");	
		System.out.println(" "); 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	b=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj ilo�ci miesi�cy kredytowania:");

while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta�a niepoprawna warto��");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	c=zdolnosc.nextDouble();

        while (c<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Ilo�� miesi�cy kredytowania nie mo�e by� mniejsza od 0");
	System.out.println("Podaj ilo�ci miesi�cy kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println(" ");
		System.out.println("Wpisana zosta�a niepoprawna warto��");	
		System.out.println(" "); 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	c=zdolnosc.nextDouble();}
break;}
}
     	int b1 = (int) b;
     	int c1 = (int) c;
	int d  = (12*b1)+c1;

	System.out.println(" ");
	System.out.println("Podaj oprocentowanie nominalne kredytu:");	
	System.out.println("*prosz� o nie dopisywanie znaku '%'");	
	double e;

while (true) {
	while (!zdolnosc.hasNextDouble()){
	System.out.println(" ");	 
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	e=zdolnosc.nextDouble();

        while (e<0 || e>100){
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Oprocentowanie nominalne kredytu nie mo�e by� mniejsze od 0 lub wi�ksze ni� 100%");
	System.out.println("Podaj oprocentowanie nominalne kredytu:"); 
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	e=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj sum� �rednich wydatk�w miesi�cznych:");	
	double f;


while (true) {
	while (!zdolnosc.hasNextDouble()){
	System.out.println(" ");	 
	System.out.println("Wpisana zosta�a niepoprawna warto��");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	f=zdolnosc.nextDouble();

	while (f<0){
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Suma �rednich wydatk�w miesi�cznych nie mo�e by� mniejsza od 0");
	System.out.println("Podaj sum� �rednich wydatk�w miesi�cznych:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	f=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj sum� miesi�cznych rat kredytowych:");	
	double g;


while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta�a niepoprawna warto��");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	g=zdolnosc.nextDouble();

	while (g<0){
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Suma miesi�cznych rat kredytowych nie mo�e by� mniejsza od 0");
	System.out.println("Podaj sum� miesi�cznych rat kredytowych:");	
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	g=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj sum� innych miesi�cznych zobowi�za�:");
	double h;

while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	h=zdolnosc.nextDouble();

	while (h<0){
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Suma innych miesi�cznych zobowi�za� nie mo�e by� mniejsza od 0");
	System.out.println("Podaj sum� innych miesi�cznych zobowi�za�:");	
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	h=zdolnosc.nextDouble();}
break;}

	double alfa=a-f-g-h;

	double beta;
	if (a<=1000) beta=a*0.32;
	else if (a>1000 && a<=1100) beta=0.47*a;
	else if (a>1100 && a<=2500) beta=0.51*a;
	else if (a>2500 && a<=3000) beta=0.65*a;
	else if (a>3000 && a<=4000) beta=0.73*a;
	else beta=0.75*a;

	if (alfa<=beta){
	System.out.println(" ");
	System.out.printf("Maksymalna rata kredytu:\t %.2f PLN",alfa);
	System.out.println(" ");	
	double y = 1-(e/1200);
	double p = Math.pow(y,d);
	double x = alfa*y*((1-p)/(1-y));
	System.out.printf("Zdolno�� kredytowa:\t\t %.2f PLN",x);
	}
	else{
	System.out.println(" ");
	System.out.printf("Maksymalna rata kredytu:\t %.2f PLN",beta);
	System.out.println(" ");	
	double y = 1-(e/1200);
	double p = Math.pow(y,d);
	double x = beta*y*((1-p)/(1-y));
	System.out.printf("Zdolno�� kredytowa:\t\t %.2f PLN",x);
	}
	break;
	}
case "2":{
Scanner zdolnosc = new Scanner(System.in);
	System.out.println(" ");
	System.out.println("Witamy w kalkulatorze kredytowym. Pozwala on obliczy� wysoko�� raty Twojego kredytu, jak d�ugo b�dziesz sp��ca� zad�u�enie i ile zap�acisz odsetek");
	System.out.println("Prosz� o podanie kwoty kredytu:");
	double a;
while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta�a niepoprawna warto��");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	a=zdolnosc.nextDouble();

        while (a<=0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Kwota kredytu nie mo�e by� mniejsza, b�d� r�wna 0");
	System.out.println("Prosz� o podanie kwoty kredytu:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	a=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj oprocentowanie nominalne kredytu:");	
	System.out.println("*prosz� o nie dopisywanie znaku '%'");	
	double e;
while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	e=zdolnosc.nextDouble();

        while (e<0 || e>100){
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Oprocentowanie nominalne kredytu nie mo�e by� mniejsze od 0 lub wi�ksze ni� 100%");
	System.out.println("Podaj oprocentowanie nominalne kredytu:"); 
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	e=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("W kolejnym kroku nale�y poda� okres kredytowania.");
	System.out.println("Podane lata oraz miesi�ce sumuj� si�, prosz� o podanie ca�kowitych warto�ci w obu przypadkach.");
	System.out.println("Podaj ilo�� lat kredytowania:");
	double b;

while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	b=zdolnosc.nextDouble();

        while (b<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Ilo�� lat kredytowania nie mo�e by� mniejsza od 0");
	System.out.println("Podaj ilo�� lat kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	b=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj ilo�ci miesi�cy kredytowania:");
	double c;

while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta�a niepoprawna warto��");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	c=zdolnosc.nextDouble();

        while (c<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Ilo�� miesi�cy kredytowania nie mo�e by� mniejsza od 0");
	System.out.println("Podaj ilo�ci miesi�cy kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	c=zdolnosc.nextDouble();}
break;}

	while ((int)b==0 && (int)c==0){
	System.out.println(" ");
	System.out.println("Suma lat oraz miesi�cy kredytowania jest r�wna 0");
	System.out.println(" ");
	System.out.println("Prosz� o podanie conajmniej jednej z tych warto�ci wi�kszej od 0");
	System.out.println("Podaj ilo�� lat kredytowania:");

while (true) {
	while (!zdolnosc.hasNextDouble()){	 
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	b=zdolnosc.nextDouble();

        while (b<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Ilo�� lat kredytowania nie mo�e by� mniejsza od 0");
	System.out.println("Podaj ilo�� lat kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	b=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj ilo�ci miesi�cy kredytowania:");

while (true) {
	while (!zdolnosc.hasNextDouble()){
	System.out.println(" ");	 
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn� warto�� liczbow�:");
	zdolnosc.next();}
	c=zdolnosc.nextDouble();

        while (c<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta�a niepoprawna warto��");
	System.out.println(" ");
	System.out.println("Ilo�� miesi�cy kredytowania nie mo�e by� mniejsza od 0");
	System.out.println("Podaj ilo�ci miesi�cy kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta�a niepoprawna warto��");	 
		System.out.println("Podaj poprawn� warto�� liczbow�:");
	 	zdolnosc.next();}
	 	c=zdolnosc.nextDouble();}
break;}
}
     	int b1 = (int) b;
     	int c1 = (int) c;
	int d  = (12*b1)+c1;

	System.out.println("Jaki rodzaj rat chcesz wybra�?");
	System.out.println("Raty r�wne\t\t-\t[1]");
	System.out.println("Raty malej�ce\t\t-\t[2]");
	String raty = zdolnosc.next();
	while (!raty.equals("1") && !raty.equals("2"))
{
	System.out.println(" ");
	System.out.println("Wybrany zosta� niepoprawny rodzaj rat");
	System.out.println(" ");
	System.out.println("Jaki rodzaj rat chcesz wybra�?");
	System.out.println("Raty r�wne\t\t-\t[1]");
	System.out.println("Raty malej�ce\t\t-\t[2]");
	raty = zdolnosc.next();
}
	switch(raty)	{
case "1":{
	double q = 1+(e/1200);
	double x = a*Math.pow(q,d)*(q-1)/(Math.pow(q,d)-1);						//jedna rata
	double y = (x*d)-a;	
	System.out.println(" ");									//suma odsetek
	System.out.printf("Ca�kowity koszt kredytu wynosi:\t\t\t %.2f PLN",y);
	System.out.println(" ");
	double z = ((y/d*12)/(a/2)*100);
	System.out.printf("Oprocentowanie rzeczywiste kredytu wynosi:\t %.2f",z);
	System.out.print(" %");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Czy chcesz wy�wietli� szczeg�owy plan kredytu?");
	System.out.println("TAK\t\t-\t[1]");
	System.out.println("NIE\t\t-\t[2]");
	String plan = zdolnosc.next();
	while (!plan.equals("1") && !plan.equals("2"))
{
	System.out.println(" ");
	System.out.println("Wybrana zosta�� niepoprawna komenda");
	System.out.println(" ");
	System.out.println("Czy chcesz wy�wietli� szczeg�owy plan kredytu?");
	System.out.println("TAK\t\t-\t[1]");
	System.out.println("NIE\t\t-\t[2]");
	plan = zdolnosc.next();
}
	switch(plan)	{
case "2":break;
case "1":{
	double tablicasplaty[][] = new double[d][2];
	double k = a;
	for(int i=0; i<=(d-1); i++){
	tablicasplaty[i][0] = x - (k*(e/1200));
	tablicasplaty[i][1] = x-tablicasplaty[i][0];
	k -= tablicasplaty[i][0];

	System.out.println(" ");
	System.out.println("--------------------");
	int j = i/12;
	System.out.println("ROK "+(1+j)+", MIESI�C "+((i+1)-(12*j))+":");
	System.out.println(" ");
	System.out.print("Cz�� kapita�owa wynosi:\t");
	System.out.printf("%.2f PLN",tablicasplaty[i][0]);
	System.out.println(" ");
	System.out.print("Cz�� odsetkowa wynosi:\t\t");
	System.out.printf("%.2f PLN",tablicasplaty[i][1]);
	System.out.println(" ");
	System.out.print("Rata kredytu wynosi:\t\t");
	System.out.printf("%.2f PLN",(tablicasplaty[i][0]+tablicasplaty[i][1]));
	System.out.println(" ");
}
	System.out.println("--------------------");
}
	break;
}
	break;
}	
case "2":{
	double x = a/d;
	double y = (a*e*(d+1)/2400);
	System.out.println(" ");
	System.out.printf("Ca�kowity koszt kredytu wynosi:\t\t\t %.2f PLN",y);
	System.out.println(" ");
	double z = ((y/d*12)/(a/2)*100);
	System.out.printf("Oprocentowanie rzeczywiste kredytu wynosi:\t %.2f",z);
	System.out.print(" %");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Czy chcesz wy�wietli� szczeg�owy plan kredytu?");
	System.out.println("TAK\t\t-\t[1]");
	System.out.println("NIE\t\t-\t[2]");
	String plan = zdolnosc.next();
	while (!plan.equals("1") && !plan.equals("2"))
{
	System.out.println(" ");
	System.out.println("Wybrana zosta�� niepoprawna komenda");
	System.out.println(" ");
	System.out.println("Czy chcesz wy�wietli� szczeg�owy plan kredytu?");
	System.out.println("TAK\t\t-\t[1]");
	System.out.println("NIE\t\t-\t[2]");
	plan = zdolnosc.next();
}
	switch(plan)	{
case "2":break;
case "1":{
	double tablicasplaty[][] = new double[d][2];
	for(int i=0; i<=(d-1); i++){
		tablicasplaty[i][0]=x;							//cz�� kapita�owa - zawsze sta�a
		tablicasplaty[i][1]=((a-(x*i))*(e/100)) / 12;				//cz�� odsetkowa 

	System.out.println(" ");
	System.out.println("--------------------");
	int j = i/12;
	System.out.println("ROK "+(1+j)+", MIESI�C "+((i+1)-(12*j))+":");
	System.out.println(" ");
	System.out.print("Cz�� kapita�owa wynosi:\t");
	System.out.printf("%.2f PLN",tablicasplaty[i][0]);
	System.out.println(" ");
	System.out.print("Cz�� odsetkowa wynosi:\t\t");
	System.out.printf("%.2f PLN",tablicasplaty[i][1]);
	System.out.println(" ");
	System.out.print("Rata kredytu wynosi:\t\t");
	System.out.printf("%.2f PLN",(tablicasplaty[i][0]+tablicasplaty[i][1]));
	System.out.println(" ");
}
	System.out.println("--------------------");
}
}
}
}
break;
}	
}
}
}
