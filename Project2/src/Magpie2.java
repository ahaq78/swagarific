
public class Magpie2 {

	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf ("baseball")>= 0
			||statement.indexOf ("sport")>= 0
			||statement.indexOf ("Yankees")>= 0
			||statement.indexOf ("doing")>= 0
			|| statement.indexOf ("ball")>= 0)
		{
			response = "I know you can't play sports shutup";
		}
		else if (statement.indexOf ("song")>= 0
			||statement.indexOf ("music")>= 0
			||statement.indexOf ("band")>= 0)
		{
			response = "You really wanna talk about music?";
		}
		else if (statement.indexOf ("TV")>= 0
				||statement.indexOf ("episode")>= 0
				||statement.indexOf ("show")>= 0
				||statement.indexOf ("watch")>= 0)
		{
			response = "You're dead boring my guy";
		}
		else if(statement.indexOf ("cold")>= 0
				||statement.indexOf ("hot")>= 0
				||statement.indexOf ("sun")>= 0
				||statement.indexOf ("cloud")>= 0)
		{
			response = "Timbs weather";
		}
		else if(statement.indexOf ("class")>= 0
				||statement.indexOf ("school")>= 0)
		{
			response = "School a dub watchu talkin bout";
		}
		else if(statement.indexOf ("family")>= 0
				||statement.indexOf ("mom")>= 0
				||statement.indexOf ("dad")>= 0
				||statement.indexOf ("ma")>= 0
				||statement.indexOf ("pa")>= 0
				||statement.indexOf ("brother")>= 0
				||statement.indexOf ("sister")>= 0
				||statement.indexOf ("cousin")>= 0)
		{
			response = "Hop off my life cuz";
		}
		else if(statement.indexOf ("home")>= 0)
		{
			response = "Your house";
		}
		else if(statement.indexOf ("bored")>= 0
				||statement.indexOf ("hobby")>= 0)
		{
			response = "I like to not talk to you tbh";
		}
		else if(statement.indexOf ("goal")>= 0
				||statement.indexOf ("idol")>= 0
				||statement.indexOf ("mentor")>= 0
				||statement.indexOf ("favorite")>= 0
				||statement.indexOf ("celebrity")>= 0)
		{
			response = "My timbs";
		}
		
		return response;
	}

}

