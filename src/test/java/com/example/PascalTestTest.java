package com.example;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PascalTestTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PascalTestPlugin.class);
		RuneLite.main(args);
	}
}