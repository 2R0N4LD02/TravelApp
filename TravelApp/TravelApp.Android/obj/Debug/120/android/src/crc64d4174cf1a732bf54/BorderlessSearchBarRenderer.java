package crc64d4174cf1a732bf54;


public class BorderlessSearchBarRenderer
	extends crc643f46942d9dd1fff9.SearchBarRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("TravelApp.Droid.Renderers.BorderlessSearchBarRenderer, TravelApp.Android", BorderlessSearchBarRenderer.class, __md_methods);
	}


	public BorderlessSearchBarRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == BorderlessSearchBarRenderer.class) {
			mono.android.TypeManager.Activate ("TravelApp.Droid.Renderers.BorderlessSearchBarRenderer, TravelApp.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public BorderlessSearchBarRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == BorderlessSearchBarRenderer.class) {
			mono.android.TypeManager.Activate ("TravelApp.Droid.Renderers.BorderlessSearchBarRenderer, TravelApp.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public BorderlessSearchBarRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == BorderlessSearchBarRenderer.class) {
			mono.android.TypeManager.Activate ("TravelApp.Droid.Renderers.BorderlessSearchBarRenderer, TravelApp.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
