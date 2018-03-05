package ПОТОКИ;

public class МногозадачностьКонкурент {
    //В библиотеке java.util.concurrent из Java SE5 появился целый ряд новых классов,
    // предназначенных для решения проблем многозадачности. Научившись пользоваться
    // ими, вы сможете создавать более простые и надежные многозадачные программы.
  //=======================================
   // CountDownLatch
    //Класс синхронизирует задачи, заставляя их ожидать завершения группы операций,
    //выполняемых другими задачами.
    //Объекту CountDownLatch присваивается начальное значение счетчика, а все задачи,
    //вызвавшие await() для этого объекта, блокируются до момента обнуления счетчика.
    // Другие задачи могут уменьшать счетчик, вызывая метод countDown() для объекта
    // (обычно это делается тогда, когда задача завершает свою работу). Класс CountDownLatch
    // рассчитан на «одноразовое» применение; счетчик не может возвращаться к прежнему
    // состоянию.
    //Если вам нужна версия с возможностью сброса счетчика, воспользуйтесь классом
    // CyclicBarrier.
//================================================
  //  CyclicBarrier
//    Класс CyclicBarrier используется при создании группы параллельно выполняемых задач,
//    завершения которых необходимо дождаться до перехода к следующей фазе. Все параллельные
//    задачи «приостанавливаются» у барьера, чтобы сделать возможным их согласованное
//    продвижение вперед. Класс очень похож на CountDownLatch, за одним важным исключением:
//    CountDownLatch является «одноразовым», a CyclicBarrier может использоваться снова и
//    снова.
//=================================================
   // DelayQueue
//    Класс представляет неограниченную блокирующую очередь объектов, реализующих интерфейс
//    Delayed. Объект может быть извлечен из очереди только после истечения задержки. Очередь
//    сортируется таким образом, что объект в начале очереди обладает наибольшим сроком истечения
//    задержки. Если задержка ни у одного объекта не истекла, начального элемента нет, и вызов
//    poll() возвращает null (из-за этого в очередь не могут помещаться элементы null).
//==============================
//    PriorityBlockingQueue
//    Фактически класс PriorityBlockingQueue представляет приоритетную очередь с блокирующими операциями
//    выборки. В следующем примере объектами в приоритетной очереди являются задачи, покидающие
//    очередь в порядке приоритетов. Для определения этого порядка в класс PrioritizedTask
//    включается поле priority:
}
