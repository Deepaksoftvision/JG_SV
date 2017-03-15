/**
 * 
 */
package propertyFilesReader;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;

/**
 * @author spi.qa5
 *
 */

@Resource.Classpath("Search.properties")
public class SearchPropertiesFileReader {
	public SearchPropertiesFileReader() {
		PropertyLoader.newInstance().populate(this);
	}

	@Property("username")
	private String Username;

	@Property("password")
	private String Password;

	@Property("CardNo")
	private String CardNo;

	@Property("CCMonth")
	private String CCMonth;

	@Property("CCYear")
	private String CCYear;

	@Property("CCCVV")
	private String CCCVV;

	public String getUsername() {
		return Username;
	}

	public String getCardNo() {
		return CardNo;
	}

	public String getCCMonth() {
		return CCMonth;
	}

	public String getCCYear() {
		return CCYear;
	}

	public String getCCCVV() {
		return CCCVV;
	}

	public String getPassword() {
		return Password;
	}

}
