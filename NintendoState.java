/**
 * @author grahammc
 *
 */
public class NintendoState implements State {
  private GameConsole gameConsole;

  public NintendoState(GameConsole gameConsole) {
    this.gameConsole = gameConsole;
  }

  public void pressHomeButton() {
    System.out.println("\nDisplay Home Screen.");
    gameConsole.setState(gameConsole.getHomeState());
  }

  public void pressNintendoButton() {
    System.out.println("\nYou are already viewing Nintendo");
  }

  public void pressXBoxButton() {
    System.out.println("\nStarting XBox...");
    gameConsole.setState(gameConsole.getXBoxState());
  }

  public void pressGameButton() {
    String games[] = {"Mario Party", "Super Smash Bros", "Rayman", "Megaman", "Sonic"};
    System.out.println("You have the following games: ");
    for (String game : games) {
      System.out.println(game);
    }
  }
}
