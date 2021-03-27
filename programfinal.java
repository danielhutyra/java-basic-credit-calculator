import java.util.Scanner;
class programfinal
{
	public static void main (String [] args)
	{
	Scanner pobierz = new Scanner(System.in);
	System.out.println("Wybierz, któr¹ funkcjê programu chcesz u¿ywaæ:");
	System.out.println("Kalkulator zdolnoœci kredytowej\t\t-\t[1]");
	System.out.println("Symulacja kredytu\t\t\t-\t[2]");
	String wybor = pobierz.next();
	while (!wybor.equals("1") && !wybor.equals("2"))
{
	System.out.println(" ");
	System.out.println("Wybrana zosta³a niepoprawna funkcja");
	System.out.println(" ");
	System.out.println("Wybierz, któr¹ funkcjê programu chcesz u¿ywaæ:");
	System.out.println("Kalkulator zdolnoœci kredytowej\t\t-\t[1]");
	System.out.println("Symulacja kredytu\t\t\t-\t[2]");
	wybor = pobierz.next();
}

	switch (wybor) {
case "1":{
	Scanner zdolnosc = new Scanner(System.in);
	System.out.println(" ");
	System.out.println("Witamy w kalkulatorze zdolnoœci kredytowej, który umo¿liwia orientacyjne ustalenie wysokoœci rat oraz kwoty kredytu ze wzglêdu na pare parametrów.");
	System.out.println("Proszê o podanie miesiêcznego dochódu gospodarstwa domowego netto");
	double a;


while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	a=zdolnosc.nextDouble();

        while (a<=0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Dochód gospodarstwa domowego netto nie mo¿e byæ mniejszy, b¹dŸ równy 0");
	System.out.println("Proszê o podanie miesiêcznego dochódu gospodarstwa domowego netto"); 
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	a=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("W kolejnym kroku nale¿y podaæ okres kredytowania.");
	System.out.println("Podane lata oraz miesi¹ce sumuj¹ siê, proszê o podanie ca³kowitych wartoœci w obu przypadkach.");
	System.out.println("Podaj iloœæ lat kredytowania:");
	double b;

while (true) {
	while (!zdolnosc.hasNextDouble()){
	System.out.println(" ");	 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	b=zdolnosc.nextDouble();

        while (b<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Iloœæ lat kredytowania nie mo¿e byæ mniejsza od 0");
	System.out.println("Podaj iloœæ lat kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	b=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj iloœci miesiêcy kredytowania:");
	double c;

while (true) {
	while (!zdolnosc.hasNextDouble()){
	System.out.println(" ");	 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	c=zdolnosc.nextDouble();

        while (c<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Iloœæ miesiêcy kredytowania nie mo¿e byæ mniejsza od 0");
	System.out.println("Podaj iloœci miesiêcy kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	c=zdolnosc.nextDouble();}
break;}

	while ((int)b==0 && (int)c==0){
	System.out.println(" ");
	System.out.println("Suma lat oraz miesiêcy kredytowania jest równa 0");
	System.out.println(" ");
	System.out.println("Proszê o podanie conajmniej jednej z tych wartoœci wiêkszej od 0");
	System.out.println("Podaj iloœæ lat kredytowania:");

while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	b=zdolnosc.nextDouble();

        while (b<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Iloœæ lat kredytowania nie mo¿e byæ mniejsza od 0");
	System.out.println("Podaj iloœæ lat kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println(" ");
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	
		System.out.println(" "); 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	b=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj iloœci miesiêcy kredytowania:");

while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	c=zdolnosc.nextDouble();

        while (c<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Iloœæ miesiêcy kredytowania nie mo¿e byæ mniejsza od 0");
	System.out.println("Podaj iloœci miesiêcy kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println(" ");
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	
		System.out.println(" "); 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	c=zdolnosc.nextDouble();}
break;}
}
     	int b1 = (int) b;
     	int c1 = (int) c;
	int d  = (12*b1)+c1;

	System.out.println(" ");
	System.out.println("Podaj oprocentowanie nominalne kredytu:");	
	System.out.println("*proszê o nie dopisywanie znaku '%'");	
	double e;

while (true) {
	while (!zdolnosc.hasNextDouble()){
	System.out.println(" ");	 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	e=zdolnosc.nextDouble();

        while (e<0 || e>100){
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Oprocentowanie nominalne kredytu nie mo¿e byæ mniejsze od 0 lub wiêksze ni¿ 100%");
	System.out.println("Podaj oprocentowanie nominalne kredytu:"); 
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	e=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj sumê œrednich wydatków miesiêcznych:");	
	double f;


while (true) {
	while (!zdolnosc.hasNextDouble()){
	System.out.println(" ");	 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	f=zdolnosc.nextDouble();

	while (f<0){
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Suma œrednich wydatków miesiêcznych nie mo¿e byæ mniejsza od 0");
	System.out.println("Podaj sumê œrednich wydatków miesiêcznych:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	f=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj sumê miesiêcznych rat kredytowych:");	
	double g;


while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	g=zdolnosc.nextDouble();

	while (g<0){
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Suma miesiêcznych rat kredytowych nie mo¿e byæ mniejsza od 0");
	System.out.println("Podaj sumê miesiêcznych rat kredytowych:");	
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	g=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj sumê innych miesiêcznych zobowi¹zañ:");
	double h;

while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	h=zdolnosc.nextDouble();

	while (h<0){
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Suma innych miesiêcznych zobowi¹zañ nie mo¿e byæ mniejsza od 0");
	System.out.println("Podaj sumê innych miesiêcznych zobowi¹zañ:");	
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
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
	System.out.printf("Zdolnoœæ kredytowa:\t\t %.2f PLN",x);
	}
	else{
	System.out.println(" ");
	System.out.printf("Maksymalna rata kredytu:\t %.2f PLN",beta);
	System.out.println(" ");	
	double y = 1-(e/1200);
	double p = Math.pow(y,d);
	double x = beta*y*((1-p)/(1-y));
	System.out.printf("Zdolnoœæ kredytowa:\t\t %.2f PLN",x);
	}
	break;
	}
case "2":{
Scanner zdolnosc = new Scanner(System.in);
	System.out.println(" ");
	System.out.println("Witamy w kalkulatorze kredytowym. Pozwala on obliczyæ wysokoœæ raty Twojego kredytu, jak d³ugo bêdziesz sp³¹caæ zad³u¿enie i ile zap³acisz odsetek");
	System.out.println("Proszê o podanie kwoty kredytu:");
	double a;
while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	a=zdolnosc.nextDouble();

        while (a<=0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Kwota kredytu nie mo¿e byæ mniejsza, b¹dŸ równa 0");
	System.out.println("Proszê o podanie kwoty kredytu:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	a=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj oprocentowanie nominalne kredytu:");	
	System.out.println("*proszê o nie dopisywanie znaku '%'");	
	double e;
while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	e=zdolnosc.nextDouble();

        while (e<0 || e>100){
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Oprocentowanie nominalne kredytu nie mo¿e byæ mniejsze od 0 lub wiêksze ni¿ 100%");
	System.out.println("Podaj oprocentowanie nominalne kredytu:"); 
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	e=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("W kolejnym kroku nale¿y podaæ okres kredytowania.");
	System.out.println("Podane lata oraz miesi¹ce sumuj¹ siê, proszê o podanie ca³kowitych wartoœci w obu przypadkach.");
	System.out.println("Podaj iloœæ lat kredytowania:");
	double b;

while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	b=zdolnosc.nextDouble();

        while (b<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Iloœæ lat kredytowania nie mo¿e byæ mniejsza od 0");
	System.out.println("Podaj iloœæ lat kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	b=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj iloœci miesiêcy kredytowania:");
	double c;

while (true) {
	while (!zdolnosc.hasNextDouble()){	
	System.out.println(" "); 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	c=zdolnosc.nextDouble();

        while (c<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Iloœæ miesiêcy kredytowania nie mo¿e byæ mniejsza od 0");
	System.out.println("Podaj iloœci miesiêcy kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	c=zdolnosc.nextDouble();}
break;}

	while ((int)b==0 && (int)c==0){
	System.out.println(" ");
	System.out.println("Suma lat oraz miesiêcy kredytowania jest równa 0");
	System.out.println(" ");
	System.out.println("Proszê o podanie conajmniej jednej z tych wartoœci wiêkszej od 0");
	System.out.println("Podaj iloœæ lat kredytowania:");

while (true) {
	while (!zdolnosc.hasNextDouble()){	 
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	
	System.out.println(" "); 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	b=zdolnosc.nextDouble();

        while (b<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Iloœæ lat kredytowania nie mo¿e byæ mniejsza od 0");
	System.out.println("Podaj iloœæ lat kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	b=zdolnosc.nextDouble();}
break;}

	System.out.println(" ");
	System.out.println("Podaj iloœci miesiêcy kredytowania:");

while (true) {
	while (!zdolnosc.hasNextDouble()){
	System.out.println(" ");	 
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");	 
	System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	zdolnosc.next();}
	c=zdolnosc.nextDouble();

        while (c<0) {	
	System.out.println(" ");
	System.out.println("Wpisana zosta³a niepoprawna wartoœæ");
	System.out.println(" ");
	System.out.println("Iloœæ miesiêcy kredytowania nie mo¿e byæ mniejsza od 0");
	System.out.println("Podaj iloœci miesiêcy kredytowania:");
		while (!zdolnosc.hasNextDouble()){
		System.out.println("Wpisana zosta³a niepoprawna wartoœæ");	 
		System.out.println("Podaj poprawn¹ wartoœæ liczbow¹:");
	 	zdolnosc.next();}
	 	c=zdolnosc.nextDouble();}
break;}
}
     	int b1 = (int) b;
     	int c1 = (int) c;
	int d  = (12*b1)+c1;

	System.out.println("Jaki rodzaj rat chcesz wybraæ?");
	System.out.println("Raty równe\t\t-\t[1]");
	System.out.println("Raty malej¹ce\t\t-\t[2]");
	String raty = zdolnosc.next();
	while (!raty.equals("1") && !raty.equals("2"))
{
	System.out.println(" ");
	System.out.println("Wybrany zosta³ niepoprawny rodzaj rat");
	System.out.println(" ");
	System.out.println("Jaki rodzaj rat chcesz wybraæ?");
	System.out.println("Raty równe\t\t-\t[1]");
	System.out.println("Raty malej¹ce\t\t-\t[2]");
	raty = zdolnosc.next();
}
	switch(raty)	{
case "1":{
	double q = 1+(e/1200);
	double x = a*Math.pow(q,d)*(q-1)/(Math.pow(q,d)-1);						//jedna rata
	double y = (x*d)-a;	
	System.out.println(" ");									//suma odsetek
	System.out.printf("Ca³kowity koszt kredytu wynosi:\t\t\t %.2f PLN",y);
	System.out.println(" ");
	double z = ((y/d*12)/(a/2)*100);
	System.out.printf("Oprocentowanie rzeczywiste kredytu wynosi:\t %.2f",z);
	System.out.print(" %");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Czy chcesz wyœwietliæ szczegó³owy plan kredytu?");
	System.out.println("TAK\t\t-\t[1]");
	System.out.println("NIE\t\t-\t[2]");
	String plan = zdolnosc.next();
	while (!plan.equals("1") && !plan.equals("2"))
{
	System.out.println(" ");
	System.out.println("Wybrana zosta³¹ niepoprawna komenda");
	System.out.println(" ");
	System.out.println("Czy chcesz wyœwietliæ szczegó³owy plan kredytu?");
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
	System.out.println("ROK "+(1+j)+", MIESI¥C "+((i+1)-(12*j))+":");
	System.out.println(" ");
	System.out.print("Czêœæ kapita³owa wynosi:\t");
	System.out.printf("%.2f PLN",tablicasplaty[i][0]);
	System.out.println(" ");
	System.out.print("Czêœæ odsetkowa wynosi:\t\t");
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
	System.out.printf("Ca³kowity koszt kredytu wynosi:\t\t\t %.2f PLN",y);
	System.out.println(" ");
	double z = ((y/d*12)/(a/2)*100);
	System.out.printf("Oprocentowanie rzeczywiste kredytu wynosi:\t %.2f",z);
	System.out.print(" %");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("Czy chcesz wyœwietliæ szczegó³owy plan kredytu?");
	System.out.println("TAK\t\t-\t[1]");
	System.out.println("NIE\t\t-\t[2]");
	String plan = zdolnosc.next();
	while (!plan.equals("1") && !plan.equals("2"))
{
	System.out.println(" ");
	System.out.println("Wybrana zosta³¹ niepoprawna komenda");
	System.out.println(" ");
	System.out.println("Czy chcesz wyœwietliæ szczegó³owy plan kredytu?");
	System.out.println("TAK\t\t-\t[1]");
	System.out.println("NIE\t\t-\t[2]");
	plan = zdolnosc.next();
}
	switch(plan)	{
case "2":break;
case "1":{
	double tablicasplaty[][] = new double[d][2];
	for(int i=0; i<=(d-1); i++){
		tablicasplaty[i][0]=x;							//czêœæ kapita³owa - zawsze sta³a
		tablicasplaty[i][1]=((a-(x*i))*(e/100)) / 12;				//czêœæ odsetkowa 

	System.out.println(" ");
	System.out.println("--------------------");
	int j = i/12;
	System.out.println("ROK "+(1+j)+", MIESI¥C "+((i+1)-(12*j))+":");
	System.out.println(" ");
	System.out.print("Czêœæ kapita³owa wynosi:\t");
	System.out.printf("%.2f PLN",tablicasplaty[i][0]);
	System.out.println(" ");
	System.out.print("Czêœæ odsetkowa wynosi:\t\t");
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
