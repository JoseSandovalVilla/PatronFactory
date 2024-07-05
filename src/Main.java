public class Main {
    public static void main(String[] args) {
        NotificacionAbstractFactory urgenteFactory = new UrgenteNotificacionFactory();
        Notificacion emailUrgente = urgenteFactory.crearEmailNotificacion();
        emailUrgente.enviarMensaje("Mensaje urgente de prueba");

        NotificacionAbstractFactory regularFactory = new RegularNotificacionFactory();
        Notificacion smsRegular = regularFactory.crearSMSNotificacion();
        smsRegular.enviarMensaje("Mensaje regular de prueba");
    }
}
