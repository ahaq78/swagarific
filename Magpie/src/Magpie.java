/*Sadie Reuter
 * Magpie Project
 * Brooklyn Technical High School
 * 12-10-16 */

//This asks the user questions in response to some key words in their responses.

public class Magpie
{
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf ("baseball")>= 0
			|| statement.indexOf ("sport")>= 0
			|| statement.indexOf ("ball")>= 0)
		{
			response = "How are the Yankees doin?";
		}
		else if (statement.indexOf ("song")>= 0
			||statement.indexOf ("music")>= 0
			||statement.indexOf ("band")>= 0)
		{
			response = "What type of music do you like?";
		}
		else if (statement.indexOf ("TV")>= 0
			||statement.indexOf ("episode")>= 0
			||statement.indexOf ("show")>= 0
			||statement.indexOf ("watch")>= 0
			||statement.indexOf ("Netflix")>= 0)
		{
			response = "What's your favorite show?";
		}
		else if(statement.indexOf ("cold")>= 0
			||statement.indexOf ("hot")>= 0
			||statement.indexOf ("sun")>= 0
			||statement.indexOf ("cloud")>= 0)
		{
			response = "How's the weather?";
		}
		else if(statement.indexOf ("class")>= 0
			||statement.indexOf ("school")>= 0
			||statement.indexOf ("smart")>= 0
			||statement.indexOf ("stupid")>= 0
			||statement.indexOf ("dumb")>= 0)
		{
			response = "How's school goin?";
		}
		else if(statement.indexOf ("mom")>= 0
			||statement.indexOf ("dad")>= 0
			||statement.indexOf ("ma")>= 0
			||statement.indexOf ("pa")>= 0
			||statement.indexOf ("pops")>= 0
			||statement.indexOf ("brother")>= 0
			||statement.indexOf ("sister")>= 0
			||statement.indexOf ("sis")>= 0
			||statement.indexOf ("bro")>= 0
			||statement.indexOf ("cousin")>= 0
			||statement.indexOf ("cuz")>= 0)
		{
			response = "What's your family like?";
		}
		else if(statement.indexOf ("home")>= 0)
		{
			response = "Where you from?";
		}
		else if(statement.indexOf ("bored")>= 0
			||statement.indexOf ("hobby")>= 0
			||statement.indexOf ("lazy")>= 0)
		{
			response = "What you like to do?";
		}
		else if(statement.indexOf ("goal")>= 0
			||statement.indexOf ("idol")>= 0
			||statement.indexOf ("mentor")>= 0
			||statement.indexOf ("celebrity")>= 0
			||statement.indexOf ("famous")>= 0)
		{
			response = "Who's your favorite celeb?"; 
		}
		else if(statement.indexOf ("weekend")>= 0
			||statement.indexOf ("plans")>= 0
			||statement.indexOf ("vacation")>= 0
			||statement.indexOf ("have fun")>= 0)	
		{
			response = "What you doin this weekend?";
		}
		else if(statement.indexOf ("dog")>= 0
			||statement.indexOf ("cat")>= 0
			||statement.indexOf ("fish")>= 0
			||statement.indexOf ("animal")>= 0
			||statement.indexOf ("pet")>= 0
			||statement.indexOf ("hamster")>= 0
			||statement.indexOf ("gerbil")>= 0
			||statement.indexOf ("snake")>= 0
			||statement.indexOf ("turtle")>= 0
			||statement.indexOf ("lizard")>= 0)	
		{
			response = "Got any pets?";
		}
		else if(statement.indexOf ("instrument")>= 0
			||statement.indexOf ("play")>=0)	
		{
			response = "Do you play an instrument?";
		}
			
		return response;
	}
}