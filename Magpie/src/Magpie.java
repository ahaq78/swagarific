public class Magpie
{
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf ("baseball")>= 0
			|| statement.indexOf ("sport")>= 0
			|| statement.indexOf ("ball")>= 0)
		{
			response = "How are the Yankees doin this season?";
		}
		else if (statement.indexOf ("song")>= 0
			||statement.indexOf ("music")>= 0
			||statement.indexOf ("band")>= 0)
		{
			response = "What is your favorite band?";
		}
		else if (statement.indexOf ("TV")>= 0
				||statement.indexOf ("episode")>= 0
				||statement.indexOf ("show")>= 0
				||statement.indexOf ("watch")>= 0)
		{
			response = "What is your favorite TV show?";
		}
		else if(statement.indexOf ("cold")>= 0
				||statement.indexOf ("hot")>= 0
				||statement.indexOf ("sun")>= 0
				||statement.indexOf ("cloud")>= 0)
		{
			response = "How's the weather today?";
		}
		else if(statement.indexOf ("class")>= 0
				||statement.indexOf ("school")>= 0)
		{
			response = "How is school?";
		}
		else if(statement.indexOf ("mom")>= 0
				||statement.indexOf ("dad")>= 0
				|statement.indexOf ("ma")>= 0
				||statement.indexOf ("pa")>= 0
				||statement.indexOf ("brother")>= 0
				||statement.indexOf ("sister")>= 0
				||statement.indexOf ("cousin")>= 0)
		{
			response = "What is your family like?";
		}
		else if(statement.indexOf ("home")>= 0)
		{
			response = "Where are you from?";
		}
		else if(statement.indexOf ("bored")>= 0
				||statement.indexOf ("hobby")>= 0)
		{
			response = "What do you like to do?";
		}
		else if(statement.indexOf ("goal")>= 0
				||statement.indexOf ("idol")>= 0
				||statement.indexOf ("mentor")>= 0
				||statement.indexOf ("celebrity")>= 0)
		{
			response = "Who is your favorite celeb?";
		}
		
		return response;
	}
}