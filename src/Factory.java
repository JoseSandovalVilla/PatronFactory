class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("EMAIL")) {
            return new EmailNotificacion();
        } else if (tipo.equalsIgnoreCase("SMS")) {
            return new SMSNotificacion();
        } else if (tipo.equalsIgnoreCase("APP")) {
            return new AppNotificacion();
        }
        return null;
    }
}
