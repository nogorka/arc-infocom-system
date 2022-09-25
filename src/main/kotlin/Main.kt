import abstractFactory.*
import adapter.game.*
import adapter.sensor.*
import chainofResponsibility.*
import command.Calculator
import decorator.*
import facade.*
import factoryMethod.*
import singleton.*
import strategy.navigation.*
import strategy.sort.*
import templateMethod.haircut.*
import templateMethod.progression.*


fun main(args: Array<String>) {

    task1Game()                 // адаптер из примера
    task1Sensor()               // адаптер для вычисления температуры
    task2()                     // фабрика с дополнительными свойствами
    task3()                     // фабричный метод
    task4()                     // синглтон: в котлине для работы с этим паттерном необходимо использовать тип object
    task5Sort()                 // стратегии сортировка из примера
    task5Navigation()           // стратегии навигация в городе для разных групп
    task6Progression()          // шаблонный метод на примере регресии
    task6HairCut()              // шаблонный метод на примере порцесса мтрижки
    task7()                     // фасад из примера, добавлен дополнительный метод
    task8()                     // цепочка обязоностей
    task9()                     // команда с дополнением методов - * / redo undo повторяющихся
    task10()                    // декоратор
}

fun task9() {
    val calculator = Calculator()
    var result = 0.0
    result = calculator.add(5.0)
    println(result)
    result = calculator.add(4.0)
    println(result)
    result = calculator.add(3.0)
    println(result)

    result = calculator.multiply(10.0)
    println(result)

    result = calculator.subtraction(1.0)
    println(result)
    result = calculator.division(2.0)
    println(result)
}

fun task10() {
    val reno = Renault("Рено", "Renault LOGAN Active", 499.0)
    autoPrint(reno)

    val myreno: AutoBase = MediaNAV(reno, "Навигация")
    autoPrint(myreno)

    val newmyReno: AutoBase = SystemSecurity(MediaNAV(reno, "Навигация"), "Безопасность")
    autoPrint(newmyReno)

    val audi = Audi("Ауди", "Audi A4", 799.0)
    autoPrint(audi)
    val comfyAudi = FastHeating(audi, "Быстрый подогрев сидений")
    autoPrint(comfyAudi)
    val chillAudi = AirConditioner(comfyAudi, "Кондиционер")
    autoPrint(chillAudi)
}

fun autoPrint(av: AutoBase) {
    println(av.toString())
}

fun task8() {
    val receiver = Receiver(bankTransfer = false, moneyTransfer = true, payPalTransfer = true)

    val bankPaymentHandler: PaymentHandler = BankPaymentHandler()
    val moneyPaymentHandler: PaymentHandler = MoneyPaymentHandler()
    val paypalPaymentHandler: PaymentHandler = PayPalPaymentHandler()

    bankPaymentHandler.successor = paypalPaymentHandler;
    paypalPaymentHandler.successor = moneyPaymentHandler;

    bankPaymentHandler.handle(receiver);
}

fun task7() {
    val drive = Drive()
    val power = Power()
    val notification = Notification()
    val microwave = Microwave(drive, power, notification)

    println("Разморозка");
    microwave.defrost();
    println()

    println("Разогрев");
    microwave.cook();
}

fun task6HairCut() {
    var longHair: Haircut = LongCut()
    longHair.templateMethod()
    println()

    longHair = ShortCut()
    longHair.templateMethod()
}

fun task6Progression() {
    val aprog: Progression = ArithmeticProgression(0, 90, 3)
    aprog.templateMethod()

    val gprog: Progression = GeometricProgression(1, 90, 3)
    gprog.templateMethod()
}

fun task5Navigation() {

    var route: StrategyNavigation = PublicTranspRoute()
    println(route.getMap() + "\n" + route.getSearch() + "\n" + route.getRoute())

    route = VeloRoute()
    println(route.getMap() + "\n" + route.getSearch() + "\n" + route.getRoute())
}

fun task5Sort() {

    val arr1 = intArrayOf(31, 15, 10, 2, 4, 2, 14, 23, 12, 66)
    var sort: StrategySort = SelectionSort()
    var context = Context(sort, arr1)
    context.sort()
    context.printArray()

    val arr2 = intArrayOf(1, 5, 10, 2, 4, 12, 14, 23, 12, 66)
    sort = InsertionSort()
    context = Context(sort, arr2)
    context.sort()
    context.printArray()

    sort = BubbleSort()
    context = Context(sort, arr2)
    context.sort()
    context.printArray()
}

fun task4() {
    val lg = Log
    lg?.logExecution("Метод Main()")

    var op: Double = Operation().run('-', 35)
    op = Operation().run('+', 30)
}

fun task3() {
    val trCom: TransportCompany = TaxiTransCom("Служба такси")
    var compService: TransportService = trCom.create("Такси", 1)
    val dist = 15.5
    myPrint(compService, dist);


    val gCom: TransportCompany = ShipTransCom("Служба перевозок")
    compService = gCom.create("Грузоперевозки", 2)
    val distg = 150.5
    myPrint(compService, distg)

    //вызов трезвого водителя
    val pCom: TransportCompany = SoberTransCom("Служба водителей")
    compService = pCom.create("Трезвый водитель", 3)
    val distp = 27.0
    myPrint(compService, distp)
}

fun myPrint(compTax: TransportService, distg: Double) {
    println(
        "Компания ${compTax.toString()} " +
                "расстояние ${distg} " +
                "cтоимость: ${compTax.costTransportation(distg)}"
    );
}

fun task2() {
    val ford_car: CarFactory = FordFactory()
    val c1 = Client(ford_car)
    println(
        "Максимальная скорость ${c1.toString()} " +
                "составляет ${c1.runMaxSpeed()} км/час " +
                "потому что тип кузова ${c1.showBodyType()}"
    )
}

fun task1Sensor() {
    val tempF = Fahrenheit()
    tempF.setValue(45f)
    println("Current temp is ${tempF.measure()}F")

    val tempCAdapter = AdapterCel(tempF)
    println("Current temp is ${tempCAdapter.measure()}^C")
}

fun task1Game() {

    val g1 = Gamer("Иван");
    println("Выпало очков ${g1.seansGame(Kost())} для игрока $g1")

    val bmon: IGame = AdapterGame(Monet())
    println("Монета показала ${g1.seansGame(bmon)} для игрока $g1")
}