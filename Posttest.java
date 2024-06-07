    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.Arrays;

    import org.junit.Test;

    import static org.junit.Assert.*;

    public class Posttest {

        @Test
        public void testValidPost() throws IOException {
                // Setup: Create valid posts with necessary attributes

            int postId1 = 101;
            String title1 = "ValidTitle";
            String body1 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags1 = {"tagone", "tagtwo"};
            String type1 = "Very Difficult";
            String emergency1 = "Immediately Needed";
            ArrayList<String> comments1 = new ArrayList<>();

            Post post1 = new Post(postId1, title1, body1, tags1, type1, emergency1, comments1);
            
            int postId2 = 102;
            String title2 = "ValidTitle";
            String body2 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags2 = {"tagone", "tagtwo"};
            String type2 = "Very Difficult";
            String emergency2 = "Immediately Needed";
            ArrayList<String> comments2 = new ArrayList<>();
            
            Post post2 = new Post(postId2, title2, body2, tags2, type2, emergency2, comments2);
            // Assertion: Check if valid posts are successfully added

            assertEquals(true, post1.addPost());
            assertEquals(true, post2.addPost());
        }







        @Test
        public void testInvalidPost() throws IOException {
        // Setup: Create invalid posts with necessary attributes
            int postId1 = 101;
            String title1 = "Virat_18"; //Invalid
            String body1 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags1 = {"tagone", "tagtwo"};
            String type1 = "Very Difficult";
            String emergency1 = "Immediately Needed";
            ArrayList<String> comments1 = new ArrayList<>();

            Post post1 = new Post(postId1, title1, body1, tags1, type1, emergency1, comments1);
            
            int postId2 = 102;
            String title2 = "Rohit_45"; //Invalid
            String body2 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags2 = {"tagone", "tagtwo"};
            String type2 = "Very Difficult";
            String emergency2 = "Immediately Needed";
            ArrayList<String> comments2 = new ArrayList<>();
            
            Post post2 = new Post(postId2, title2, body2, tags2, type2, emergency2, comments2);
            // Assertion: Check if invalid posts are rejected

            assertEquals(false, post1.addPost());
            assertEquals(false, post2.addPost());
        }













        @Test
        public void testInvalidPostBody() throws IOException {
            // Setup
            int postId1 = 101;
            String title1 = "ValidTitle";
            String body1 = "Short body.";
            String[] tags1 = {"tagone", "tagtwo"};
            String type1 = "Very Difficult";
            String emergency1 = "Immediately Needed";
            ArrayList<String> comments1 = new ArrayList<>();

            Post post1 = new Post(postId1, title1, body1, tags1, type1, emergency1, comments1);
            
            int postId2 = 102;
            String title2 = "ValidTitle";
            String body2 = "body_1";
            String[] tags2 = {"tagone", "tagtwo"};
            String type2 = "Very Difficult";
            String emergency2 = "Immediately Needed";
            ArrayList<String> comments2 = new ArrayList<>();
            
            Post post2 = new Post(postId2, title2, body2, tags2, type2, emergency2, comments2);
            // Assertion

            assertEquals(false, post1.addPost());
            assertEquals(false, post2.addPost());
        }











        @Test
        public void testInvalidPostTags() throws IOException {
            // Setup
            int postId1 = 101;
            String title1 = "ValidTitle";
            String body1 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags1 = {"tagtwo"};
            String type1 = "Very Difficult";
            String emergency1 = "Immediately Needed";
            ArrayList<String> comments1 = new ArrayList<>();

            Post post1 = new Post(postId1, title1, body1, tags1, type1, emergency1, comments1);
            
            int postId2 = 102;
            String title2 = "ValidTitle";
            String body2 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags2 = {"ta", "o"};
            String type2 = "Very Difficult";
            String emergency2 = "Immediately Needed";
            ArrayList<String> comments2 = new ArrayList<>();
            
            Post post2 = new Post(postId2, title2, body2, tags2, type2, emergency2, comments2);
            // Assertion

            assertEquals(false, post1.addPost());
            assertEquals(false, post2.addPost());
        }










        @Test
        public void testInvalidPostType() throws IOException {
            // Setup
            int postId1 = 101;
            String title1 = "ValidTitle";
            String body1 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags1 = {"tagone", "tagtwo"};
            String type1 = "Easy";
            String emergency1 = "Immediately Needed";
            ArrayList<String> comments1 = new ArrayList<>();

            Post post1 = new Post(postId1, title1, body1, tags1, type1, emergency1, comments1);
            
            int postId2 = 102;
            String title2 = "ValidTitle";
            String body2 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags2 = {"tagone", "tagtwo"};
            String type2 = "Easy";
            String emergency2 = "Highly Needed";
            ArrayList<String> comments2 = new ArrayList<>();
            
            Post post2 = new Post(postId2, title2, body2, tags2, type2, emergency2, comments2);
            // Assertion

            assertEquals(false, post1.addPost());
            assertEquals(false, post2.addPost());
        }














        @Test
        public void testInvalidPostEmergency() throws IOException {
            // Setup
            int postId1 = 101;
            String title1 = "ValidTitle";
            String body1 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags1 = {"tagone", "tagtwo"};
            String type1 = "Very Difficult";
            String emergency1 = "Ordinary";
            ArrayList<String> comments1 = new ArrayList<>();

            Post post1 = new Post(postId1, title1, body1, tags1, type1, emergency1, comments1);
            
            int postId2 = 102;
            String title2 = "ValidTitle";
            String body2 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags2 = {"tagone", "tagtwo"};
            String type2 = "Difficult";
            String emergency2 = "Ordinary";
            ArrayList<String> comments2 = new ArrayList<>();
            
            Post post2 = new Post(postId2, title2, body2, tags2, type2, emergency2, comments2);
            // Assertion

            assertEquals(false, post1.addPost());
            assertEquals(false, post2.addPost());
        }













        @Test
        public void testAddCommentValidType() throws IOException {
            int postId1 = 8;
            String title1 = "ValidTitle";
            String body1 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags1 = {"tagone", "tagtwo"};
            String type1 = "Very Difficult";
            String emergency1 = "Immediately Needed";
                    // Array of new comments to add

            ArrayList<String> comments1 = new ArrayList<>(Arrays.asList("This is a fantastic comment"));

            Post post1 = new Post(postId1, title1, body1, tags1, type1, emergency1, comments1);
            
            int postId2 = 9;
            String title2 = "ValidTitle";
            String body2 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags2 = {"tagone", "tagtwo"};
            String type2 = "Very Difficult";
            String emergency2 = "Immediately Needed";
                    // Array of new comments to add

            ArrayList<String> comments2 = new ArrayList<>(Arrays.asList("Hi this is a wonderful comment thanks"));

            Post post2 = new Post(postId2, title2, body2, tags2, type2, emergency2, comments2);

            // Assertion
            assertEquals(true, post1.addComment());
            assertEquals(true, post2.addComment());
        }













        @Test
        public void testCapitalWordInvalidType() throws IOException {
            int postId1 = 8;
            String title1 = "ValidTitle";
            String body1 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags1 = {"tagone", "tagtwo"};
            String type1 = "Very Difficult";
            String emergency1 = "Immediately Needed";
            ArrayList<String> comments1 = new ArrayList<>(Arrays.asList("oye is a fantastic comment"));

            Post post1 = new Post(postId1, title1, body1, tags1, type1, emergency1, comments1);

            int postId2 = 9;
            String title2 = "ValidTitle";
            String body2 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tags2 = {"tagone", "tagtwo"};
            String type2 = "Very Difficult";
            String emergency2 = "Immediately Needed";
            ArrayList<String> comments2 = new ArrayList<>(Arrays.asList("yo that's great"));

            Post post2 = new Post(postId2, title2, body2, tags2, type2, emergency2, comments2);

            // Assertion
            assertEquals(false, post1.addComment());
            assertEquals(false, post2.addComment());
        }















        @Test
        public void testCommentCountValidType() throws IOException {
            int postId1 = 8;
            String titlePost1 = "Valid_TitlePost1";
            String bodyPost1 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tagsPost1 = {"tagone", "tagtwo"};
            String postType = "Very Difficult";
            String emergencyPost1 = "Immediately Needed";
            ArrayList<String> commentsPost1 = new ArrayList<>(Arrays.asList("Oye is a fantastic comment", "Oye is a fantastic comment", "Oye is a fantastic comment", "Oye is a fantastic comment", "Oye is a fantastic comment", "Oye is a fantastic comment"));

            Post post1 = new Post(postId1, titlePost1, bodyPost1, tagsPost1, postType, emergencyPost1, commentsPost1);
            
            int postId2 = 8;
            String titlePost2 = "Valid_TitlePost1";
            String bodyPost2 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tagsPost2 = {"tagone", "tagtwo"};
            String postType2 = "Very Difficult";
            String emergencyPost2 = "Immediately Needed";
            ArrayList<String> commentsPost2 = new ArrayList<>(Arrays.asList("Yo that's"));

            Post post2 = new Post(postId2, titlePost2, bodyPost2, tagsPost2, postType2, emergencyPost2, commentsPost2);

            // Assertion
            assertEquals(false, post1.addComment());
            assertEquals(false, post2.addComment());
        }








        @Test
        public void testWordCountValidType() throws IOException {
            // This is for more than 4 words 
            int postId1 = 8;
            String titlePost1 = "Valid_TitlePost1";
            String bodyPost1 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tagsPost1 = {"tagone", "tagtwo"};
            String postType = "Very Difficult";
            String emergencyPost1 = "Immediately Needed";
            ArrayList<String> commentsPost1 = new ArrayList<>(Arrays.asList("Oye is fantastic"));

            Post post1 = new Post(postId1, titlePost1, bodyPost1, tagsPost1, postType, emergencyPost1, commentsPost1);
            
            int postId2 = 8;
            String titlePost2 = "Valid_TitlePost1";
            String bodyPost2 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tagsPost2 = {"tagone", "tagtwo"};
            String postType2 = "Very Difficult";
            String emergencyPost2 = "Immediately Needed";
            ArrayList<String> commentsPost2 = new ArrayList<>(Arrays.asList("Yo"));

            Post post2 = new Post(postId2, titlePost2, bodyPost2, tagsPost2, postType2, emergencyPost2, commentsPost2);

            // Assertion
            assertEquals(false, post1.addComment());
            assertEquals(false, post2.addComment());
        }









        @Test
        public void testEasyCountValidType() throws IOException {
            int postId1 = 8;
            String titlePost1 = "Valid_TitlePost1";
            String bodyPost1 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tagsPost1 = {"tagone", "tagtwo"};
            String postType = "Easy";
            String emergencyPost1 = "Immediately Needed";
            ArrayList<String> commentsPost1 = new ArrayList<>(Arrays.asList("Oye is a fantastic comment", "Oye is a fantastic comment", "Oye is a fantastic comment", "Oye is a fantastic comment", "Oye is a fantastic comment", "Oye is a fantastic comment"));

            Post post1 = new Post(postId1, titlePost1, bodyPost1, tagsPost1, postType, emergencyPost1, commentsPost1);
            
            int postId2 = 8;
            String titlePost2 = "Valid_TitlePost1";
            String bodyPost2 = "Creating a detailed and engaging post body requires careful consideration of the content and structure. This post body aims to demonstrate how to craft a well-rounded and informative piece that meets the requirement of 350 words. The key to writing an effective post body is to ensure that every sentence adds value and contributes to the overall message. By doing so, you can keep the reader engaged and provide them with valuable information. It's important to start with a clear and concise introduction that sets the stage for the rest of the post. This introduction should give the reader an idea of what to expect and why the topic is important. Following the introduction, the main body of the post should be divided into several paragraphs, each focusing on a specific aspect of the topic. This helps to break down the information into manageable chunks and makes it easier for the reader to follow. When writing the main body, it's crucial to provide detailed explanations and examples to support your points. This not only adds credibility to your writing but also makes it more interesting and relatable for the reader. Additionally, using quotes from experts or citing relevant studies can further strengthen your arguments. As you approach the end of the post, it's important to summarize the key points and provide a clear conclusion. This helps to reinforce the main message and ensures that the reader walks away with a clear understanding of the topic. Finally, it's always a good idea to proofread your post body to catch any errors or inconsistencies. This ensures that your writing is polished and professional, which can leave a lasting impression on the reader. In conclusion, crafting a well-rounded post body requires careful planning and attention to detail. By following these guidelines, you can create a piece that is not only informative but also engaging and memorable for your audience. Remember to keep your writing clear, concise, and focused, and to always provide valuable insights and information that will benefit your readers. With practice and dedication, you can master the art of writing effective post bodies that meet any word count requirement and captivate your audience.";
            String[] tagsPost2 = {"tagone", "tagtwo"};
            String postType2 = "Very Difficult";
            String emergencyPost2 = "Ordinary";
            ArrayList<String> commentsPost2 = new ArrayList<>(Arrays.asList("Oye is a fantastic comment", "Oye is a fantastic comment", "Oye is a fantastic comment", "Oye is a fantastic comment", "Oye is a fantastic comment", "Oye is a fantastic comment"));

            Post post2 = new Post(postId2, titlePost2, bodyPost2, tagsPost2, postType2, emergencyPost2, commentsPost2);

            // Assertion
            assertEquals(false, post1.addComment());
            assertEquals(false, post2.addComment());
        }










        
    @Test
        public void testCountWordValidType() throws IOException {
            // This is for more than 10 words 
            int postId1 = 8;
            String titlePost1 = "Valid_TitlePost1";
            String bodyPost1 = "This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body.";
            String[] tagsPost1 = {"tagone", "tagtwo"};
            String postType = "Easy";
            String emergencyPost1 = "Immediately Needed";
            ArrayList<String> commentsPost1 = new ArrayList<>(Arrays.asList("fantastic comment dude it looks really nice it looks awesome ok"));

            Post post1 = new Post(postId1, titlePost1, bodyPost1, tagsPost1, postType, emergencyPost1, commentsPost1);
            
            int postId2 = 8;
            String titlePost2 = "Valid_TitlePost1";
            String bodyPost2 = "This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body. This is a test post body.";
            String[] tagsPost2 = {"tagone", "tagtwo"};
            String postType2 = "Very Difficult";
            String emergencyPost2 = "Ordinary";
            ArrayList<String> commentsPost2 = new ArrayList<>(Arrays.asList("Oye is a fantastic comment like very very very good superb"));

            Post post2 = new Post(postId2, titlePost2, bodyPost2, tagsPost2, postType2, emergencyPost2, commentsPost2);

            // Assertion
            assertEquals(false, post1.addComment());
            assertEquals(false, post2.addComment());
        }
    }