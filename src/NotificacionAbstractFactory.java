interface NotificacionAbstractFactory {
    Notificacion crearEmailNotificacion();
    Notificacion crearSMSNotificacion();
    Notificacion crearAppNotificacion();
}
