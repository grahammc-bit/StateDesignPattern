/**
 * @author grahammc
 *
 */
public class XBoxState implements State {
  private GameConsole gameConsole;

  public XBoxState(GameConsole gameConsole) {
    this.gameConsole = gameConsole;
  }

  public void pressHomeButton() {
    System.out.println("\nDisplay Home Screen.");
    gameConsole.setState(gameConsole.getHomeState());
  }

  public void pressNintendoButton() {
    System.out.println("\nStarting Nintendo...");
    gameConsole.setState(gameConsole.getNintendoState());
  }

  public void pressXBoxButton() {
    System.out.println("\nYou are already viewing XBox");
  }

  public void pressGameButton() {
    String games[] = {"Halo", "Call Of Duty", "Red Dead Redemption", "GTA 5", "Forza 4"};
    System.out.println("You have the following games: ");
    for (String game : games) {
      System.out.println(game);
    }
  }
}
