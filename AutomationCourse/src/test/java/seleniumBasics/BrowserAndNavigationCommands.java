package seleniumBasics;

public class BrowserAndNavigationCommands extends Base{
public void browserCommands() {
	String title=driver.getTitle();
	System.out.println(title);
	System.out.print(source);
}
	public static void main(String[] args) {
		BrowserAndNavigationCommands br=new BrowserAndNavigationCommands();
	br.initialiseBrowser();
		br.browserCommands();
		

	}
	

}
