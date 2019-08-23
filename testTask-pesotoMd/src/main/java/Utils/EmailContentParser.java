package Utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class EmailContentParser {
	public String letterConfirmationContentParse(String content) {
		String linkHref = null;
		Document doc = Jsoup.parse(content);
		Element link = doc.select("a").first();
		linkHref = link.attr("href");
		System.out.println(linkHref);
		return linkHref;
	}

}
