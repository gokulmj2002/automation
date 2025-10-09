package seleniumBasics;

public class BrowserAndNavigationCommands extends Base{
	public void navigationCommand() {
		driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=774088017322&hvpos=&hvnetw=g&hvrand=5517579597959816256&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9149615&hvtargid=kwd-64107830&hydadcr=14452_2429115&gad_source=1");
	 driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	}
public void browserCommands() {
	String title=driver.getTitle();
	String source=driver.getPageSource();
	System.out.println(title);
	System.out.print(source);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String handleid=driver.getWindowHandle();
	System.out.println(handleid);
}
	public static void main(String[] args) {
		BrowserAndNavigationCommands br=new BrowserAndNavigationCommands();
	br.initialiseBrowser();
		br.browserCommands();
		br.navigationCommand();

	}
	

}
