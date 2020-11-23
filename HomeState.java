/**
 * @author grahammc
 *
 */
public class HomeState implements State {
  private GameConsole gameConsole;

  public HomeState(GameConsole gameConsole) {
    this.gameConsole = gameConsole;
  }

  public void pressHomeButton() {
    System.out.println("\nYou are already on the home screen.");
  }

  public void pressNintendoButton() {
    System.out.println("\nStarting Nintendo...");
    gameConsole.setState(gameConsole.getNintendoState());
  }

  public void pressXBoxButton() {
    System.out.println("\nStarting XBox...");
    gameConsole.setState(gameConsole.getXBoxState());
  }

  public void pressGameButton() {
    System.out.println("\nYou have to pick a gaming system to play.");
  }
}
