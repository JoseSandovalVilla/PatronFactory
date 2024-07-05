class UrgenteNotificacionFactory implements NotificacionAbstractFactory {
    public Notificacion crearEmailNotificacion() {
        return new EmailNotificacion(); // Enviar con prioridad alta
    }

    public Notificacion crearSMSNotificacion() {
        return new SMSNotificacion(); // Enviar con prioridad alta
    }

    public Notificacion crearAppNotificacion() {
        return new AppNotificacion(); // Enviar con prioridad alta
    }
}