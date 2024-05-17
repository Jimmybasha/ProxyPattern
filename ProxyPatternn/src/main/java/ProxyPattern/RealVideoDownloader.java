package ProxyPattern;

public class RealVideoDownloader implements VideoDownloader {

	
	@Override
	public Video getVideo(String videoUrl) {
		System.out.println("Connecting to "+videoUrl);
		System.out.println("Downloading The Video");
		
		return new Video(videoUrl);
	
	
	}
	

}
