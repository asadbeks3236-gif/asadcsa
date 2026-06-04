public String getShortenedName()
{
    String result = "";
    int i = 0;

    while (i < username.length()) {
        if (username.charAt(i) == '-') {
            // skip the character before '-' (already added) and the '-'
            i++; // move past '-'
        } else if (i + 1 < username.length() && username.charAt(i + 1) == '-') {
            // current char is before a hyphen: skip adding it
            i++; // move to '-'; loop will handle skipping it next iteration
        } else {
            result += username.charAt(i);
            i++;
        }
    }

    return result;
}

