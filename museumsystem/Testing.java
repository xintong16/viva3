package museumsystem;

/**
 *
 * @author xintong
 */
public class Testing {
    public static void main(String[] args) {
        
        Museum museum = new Museum();
        
        // This loads the text file
        museum.loadExhibits("Exhibits.txt");
        
    
//        // Expected Output
//        System.out.println("All exhibits:");
//        museum.viewAllExhibits();
//        
//        System.out.println("\nSearch exhibits by artist 'Vincent van Gogh':");
//        museum.searchExhibitsByArtist("Vincent van Gogh");
//        
//        System.out.println("\nSearch exhibits by type 'Painting':");
//        museum.searchExhibitsByType("Painting");
//        
//        System.out.println("\nSearch exhibits by year '1504':");
//        museum.searchExhibitsByYear(1504);

  
//        System.out.println("TEST CASE 1: Robustness (Case Insensitivity)");
//     
//        // Test: Search lowercase 'painting', expect to find 'Painting'
//        System.out.println("Search exhibits by type 'painting':");
//        museum.searchExhibitsByType("painting");
//        
//        // Test: Search lowercase 'vincent...', expect to find 'Vincent...'
//        System.out.println("\nSearch exhibits by artist 'vincent van gogh':");
//        museum.searchExhibitsByArtist("vincent van gogh"); 

//
//        
        System.out.println("TEST CASE 2: Error Handling (Not Found)");
   
        // Test: Search for artist that does not exist
        System.out.println("Search exhibits by artist 'Leonardo da Vinci':");
        museum.searchExhibitsByArtist("Leonardo da Vinci"); 
        
        // Test: Search for year that does not exist
        System.out.println("\nSearch exhibits by year '2025':");
        museum.searchExhibitsByYear(2025); 
        
    }
}