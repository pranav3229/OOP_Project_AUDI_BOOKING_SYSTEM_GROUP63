public interface LoggedIn_Admin {
    void Logout();
    void ViewEvents();
    void AddEvent(String a, String b, String c);
    void EditEvent(int a, int choice1,String receive);
    void DeleteEvent(int a);
    void TrackSeats();
    void TrackRevenue();
}
