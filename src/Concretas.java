class EmailNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        // Implementar lógica de envío de email
        System.out.println("Enviando email: " + mensaje);
    }
}

class SMSNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        // Implementar lógica de envío de SMS
        System.out.println("Enviando SMS: " + mensaje);
    }
}

class AppNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        // Implementar lógica de envío de mensaje en la app
        System.out.println("Enviando mensaje en la app: " + mensaje);
    }
}
