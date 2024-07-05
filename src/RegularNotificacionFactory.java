class RegularNotificacionFactory implements NotificacionAbstractFactory {
    public Notificacion crearEmailNotificacion() {
        return new EmailNotificacion(); // Enviar con prioridad normal
    }

    public Notificacion crearSMSNotificacion() {
        return new SMSNotificacion(); // Enviar con prioridad normal
    }

    public Notificacion crearAppNotificacion() {
        return new AppNotificacion(); // Enviar con prioridad normal
    }
}