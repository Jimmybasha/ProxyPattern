package ProxyPattern;
import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader {

	private final Map<String,Video> videoCache = new HashMap<>();
	private final VideoDownloader downloader = new RealVideoDownloader();
	@Override
	public Video getVideo(String videoUrl) {
		if(!videoCache.containsKey(videoUrl)) {
			videoCache.put(videoUrl,downloader.getVideo(videoUrl));
		}
		System.out.println("Retrieving video from cache....");
		System.out.println("----------------");
		return videoCache.get(videoUrl);
	}
	
}
