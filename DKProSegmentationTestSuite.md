

&lt;testSuite&gt;


> 

&lt;tests&gt;


> > 

&lt;test id="ordinal.Jahrhundert" language="de"&gt;


> > > 

&lt;input&gt;

Er starb im 19. Jahrhundert.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Er⁍ ⁌starb⁍ ⁌im⁍ ⁌19⁍ ⁌.⁍ ▶ ◀⁌Jahrhundert⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - Ordinal number point mis-detected as sentence boundary.

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Er⁍ ⁌starb⁍ ⁌im⁍ ⁌19.⁍ ⁌Jahrhundert⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - Ordinal number point is part of number token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Er⁍ ⁌starb⁍ ⁌im⁍ ⁌19⁍ ⁌.⁍ ⁌Jahrhundert⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - Ordinal number point is separate token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="ordinal.Mann" language="de"&gt;


> > > 

&lt;input&gt;

Und dann kam der 3. Mann ins Spiel.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Und⁍ ⁌dann⁍ ⁌kam⁍ ⁌der⁍ ⁌3⁍ ⁌.⁍ ▶ ◀⁌Mann⁍ ⁌ins⁍ ⁌Spiel⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - Ordinal number point mis-detected as sentence boundary.

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Und⁍ ⁌dann⁍ ⁌kam⁍ ⁌der⁍ ⁌3.⁍ ⁌Mann⁍ ⁌ins⁍ ⁌Spiel⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - Ordinal number point is part of number token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="ordinal.Platz" language="de"&gt;


> > > 

&lt;input&gt;

Sie stehen zurzeit auf dem 15. Platz der Rangliste.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Sie⁍ ⁌stehen⁍ ⁌zurzeit⁍ ⁌auf⁍ ⁌dem⁍ ⁌15⁍ ⁌.⁍ ▶ ◀⁌Platz⁍ ⁌der⁍ ⁌Rangliste⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - Ordinal number point mis-detected as sentence boundary.

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Sie⁍ ⁌stehen⁍ ⁌zurzeit⁍ ⁌auf⁍ ⁌dem⁍ ⁌15.⁍ ⁌Platz⁍ ⁌der⁍ ⁌Rangliste⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - Ordinal number point is part of number token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Sie⁍ ⁌stehen⁍ ⁌zurzeit⁍ ⁌auf⁍ ⁌dem⁍ ⁌15⁍ ⁌.⁍ ⁌Platz⁍ ⁌der⁍ ⁌Rangliste⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - Ordinal number point is separate token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="ordinal.Weltkrieg" language="de"&gt;


> > > 

&lt;input&gt;

Der 1. Weltkrieg dauerte 4 Jahre.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Der⁍ ⁌1⁍ ⁌.⁍ ▶ ◀⁌Weltkrieg⁍ ⁌dauerte⁍ ⁌4⁍ ⁌Jahre⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - Ordinal number point mis-detected as sentence boundary and is separate token.

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Der⁍ ⁌1.⁍ ⁌Weltkrieg⁍ ⁌dauerte⁍ ⁌4⁍ ⁌Jahre⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - Ordinal number point is part of number token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="ordinal.date" language="de"&gt;


> > > 

&lt;input&gt;

Der erste Weltkrieg begann mit dem Attentat von Sarajevo am 28. Juni 1914.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Der⁍ ⁌erste⁍ ⁌Weltkrieg⁍ ⁌begann⁍ ⁌mit⁍ ⁌dem⁍ ⁌Attentat⁍ ⁌von⁍ ⁌Sarajevo⁍ ⁌am⁍ ⁌28⁍ ⁌.⁍ ▶ ◀⁌Juni⁍ ⁌1914⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - Ordinal number point mis-detected as sentence boundary.

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Der⁍ ⁌erste⁍ ⁌Weltkrieg⁍ ⁌begann⁍ ⁌mit⁍ ⁌dem⁍ ⁌Attentat⁍ ⁌von⁍ ⁌Sarajevo⁍ ⁌am⁍ ⁌28.⁍ ⁌Juni⁍ ⁌1914.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - Ordinal number point is part of number token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Der⁍ ⁌erste⁍ ⁌Weltkrieg⁍ ⁌begann⁍ ⁌mit⁍ ⁌dem⁍ ⁌Attentat⁍ ⁌von⁍ ⁌Sarajevo⁍ ⁌am⁍ ⁌28⁍ ⁌.⁍ ⁌Juni⁍ ⁌1914⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - Ordinal number point is separate token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="abbreviation.M\_Sc\_" language="de"&gt;


> > > 

&lt;input&gt;

Der akademische Titel M.Sc. Informatik berechtigt zur Promotion.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Der⁍ ⁌akademische⁍ ⁌Titel⁍ ⁌M.Sc⁍ ⁌.⁍ ▶ ◀⁌Informatik⁍ ⁌berechtigt⁍ ⁌zur⁍ ⁌Promotion⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - dot closing abbreviation mis-detected as sentence boundary

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Der⁍ ⁌akademische⁍ ⁌Titel⁍ ⁌M⁍ ⁌.⁍ ⁌Sc⁍ ⁌.⁍ ▶ ◀⁌Informatik⁍ ⁌berechtigt⁍ ⁌zur⁍ ⁌Promotion⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - dot closing abbreviation mis-detected as sentence boundary and abbreviation falls apart

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="abbreviation.middle.initial" language="de"&gt;


> > > 

&lt;input&gt;

Christian M. Meyer wird demnächst seine Dissertation fertig stellen.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Christian⁍ ⁌M.⁍ ⁌Meyer⁍ ⁌wird⁍ ⁌demnächst⁍ ⁌seine⁍ ⁌Dissertation⁍ ⁌fertig⁍ ⁌stellen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - middle initial dot not separated, single sentence

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Christian⁍ ⁌M⁍ ⁌.⁍ ▶ ◀⁌Meyer⁍ ⁌wird⁍ ⁌demnächst⁍ ⁌seine⁍ ⁌Dissertation⁍ ⁌fertig⁍ ⁌stellen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - closing dot mis-detected as sentence boundary and is separated from abbreviation

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Christian⁍ ⁌M.⁍ ▶ ◀⁌Meyer⁍ ⁌wird⁍ ⁌demnächst⁍ ⁌seine⁍ ⁌Dissertation⁍ ⁌fertig⁍ ⁌stellen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - closing dot  mis-detected as sentence boundary and abbreviation falls apart

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Christian⁍ ⁌M⁍ ⁌.⁍ ⁌Meyer⁍ ⁌wird⁍ ⁌demnächst⁍ ⁌seine⁍ ⁌Dissertation⁍ ⁌fertig⁍ ⁌stellen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - closing dot is separated from abbreviation

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="directspeech.question.smartquotes" language="de"&gt;


> > > 

&lt;input&gt;

„Wird der Splitter das hier meistern?“, wollte er wissen.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌„⁍ ⁌Wird⁍ ⁌der⁍ ⁌Splitter⁍ ⁌das⁍ ⁌hier⁍ ⁌meistern⁍ ⁌?⁍ ▶ ◀⁌“⁍ ⁌,⁍ ⁌wollte⁍ ⁌er⁍ ⁌wissen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - the two quotes end up in different sentences

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌„Wird⁍ ⁌der⁍ ⁌Splitter⁍ ⁌das⁍ ⁌hier⁍ ⁌meistern⁍ ⁌?“,⁍ ▶ ◀⁌wollte⁍ ⁌er⁍ ⁌wissen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - two sentences and punctuation cloggs together

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌„⁍ ⁌Wird⁍ ⁌der⁍ ⁌Splitter⁍ ⁌das⁍ ⁌hier⁍ ⁌meistern⁍ ⁌?⁍ ⁌“⁍ ⁌,⁍ ⁌wollte⁍ ⁌er⁍ ⁌wissen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - one sentence

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="directspeech.question.doublequotes" language="de"&gt;


> > > 

&lt;input&gt;

"Wird der Splitter das hier meistern?", wollte er wissen.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌"⁍ ⁌Wird⁍ ⁌der⁍ ⁌Splitter⁍ ⁌das⁍ ⁌hier⁍ ⁌meistern⁍ ⁌?⁍ ⁌"⁍ ▶ ◀⁌,⁍ ⁌wollte⁍ ⁌er⁍ ⁌wissen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - two sentences

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌"Wird⁍ ⁌der⁍ ⁌Splitter⁍ ⁌das⁍ ⁌hier⁍ ⁌meistern⁍ ⁌?",⁍ ▶ ◀⁌wollte⁍ ⁌er⁍ ⁌wissen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - two sentences and punctuation cloggs together

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌"⁍ ⁌Wird⁍ ⁌der⁍ ⁌Splitter⁍ ⁌das⁍ ⁌hier⁍ ⁌meistern⁍ ⁌?⁍ ⁌"⁍ ⁌,⁍ ⁌wollte⁍ ⁌er⁍ ⁌wissen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - one sentence

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="number.version.underspecified" language="en"&gt;


> > > 

&lt;input&gt;

John loves Windows 3.x and DOS.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌John⁍ ⁌loves⁍ ⁌Windows⁍ ⁌3⁍ ⁌.⁍ ⁌x⁍ ⁌and⁍ ⁌DOS⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - version split into multiple tokens

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌John⁍ ⁌loves⁍ ⁌Windows⁍ ⁌3.x⁍ ⁌and⁍ ⁌DOS.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence marker is not a separate token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌John⁍ ⁌loves⁍ ⁌Windows⁍ ⁌3⁍ ⁌.⁍ ▶ ◀⁌x⁍ ⁌and⁍ ⁌DOS⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - version separator misdetected as sentence separator

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌John⁍ ⁌loves⁍ ⁌Windows⁍ ⁌3.x⁍ ⁌and⁍ ⁌DOS⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - underspecified version detected

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="namedentity.ampersand" language="en"&gt;


> > > 

&lt;input&gt;

I called the AT&amp;T support today.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌I⁍ ⁌called⁍ ⁌the⁍ ⁌AT⁍ ⁌&amp;⁍ ⁌T⁍ ⁌support⁍ ⁌today⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - "AT&amp;T" is split

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌I⁍ ⁌called⁍ ⁌the⁍ ⁌AT&amp;T⁍ ⁌support⁍ ⁌today⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - "AT&amp;T" is one token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="number.n-th" language="en"&gt;


> > > 

&lt;input&gt;

We travel to the n-th dimension.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌We⁍ ⁌travel⁍ ⁌to⁍ ⁌the⁍ ⁌n-th⁍ ⁌dimension⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - "n-th" is one token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="namedentity.location.compound" language="en"&gt;


> > > 

&lt;input&gt;

We visit Barton-upon-Humber in summer.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌We⁍ ⁌visit⁍ ⁌Barton-upon-Humber⁍ ⁌in⁍ ⁌summer⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - "Barton-upon-Humber" is one token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="time.decade" language="en"&gt;


> > > 

&lt;input&gt;

The '20s had been a tough time.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌'⁍ ⁌20s⁍ ⁌had⁍ ⁌been⁍ ⁌a⁍ ⁌tough⁍ ⁌time⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - the apostrophe is split off

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌'20s⁍ ⁌had⁍ ⁌been⁍ ⁌a⁍ ⁌tough⁍ ⁌time⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - the apostrophe is not split off

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="number.range" language="en"&gt;


> > > 

&lt;input&gt;

We get 10-20 of these each day.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌We⁍ ⁌get⁍ ⁌10⁍ ⁌-⁍ ⁌20⁍ ⁌of⁍ ⁌these⁍ ⁌each⁍ ⁌day⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - the range is split into multiple tokens

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌We⁍ ⁌get⁍ ⁌10-20⁍ ⁌of⁍ ⁌these⁍ ⁌each⁍ ⁌day⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - the range is one token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="number.percentage" language="en"&gt;


> > > 

&lt;input&gt;

The car is 20% off today.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌car⁍ ⁌is⁍ ⁌20⁍ ⁌%⁍ ⁌off⁍ ⁌today⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - "20%" is split into two tokens

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌car⁍ ⁌is⁍ ⁌20%⁍ ⁌off⁍ ⁌today⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - "20%" is one token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="wisp" language="en"&gt;


> > > 

&lt;input&gt;

The elusive will-o'-the-wisp haunts the forest.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌elusive⁍ ⁌will-o⁍ ⁌'⁍ ⁌-⁍ ⁌the-wisp⁍ ⁌haunts⁍ ⁌the⁍ ⁌forest⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - "will-o'-the-wisp" is split into multiple tokens

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌elusive⁍ ⁌will-o⁍ ⁌'⁍ ⁌-the-wisp⁍ ⁌haunts⁍ ⁌the⁍ ⁌forest⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - "will-o'-the-wisp" is split into multiple tokens

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌elusive⁍ ⁌will-o'-the-wisp⁍ ⁌haunts⁍ ⁌the⁍ ⁌forest⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - "will-o'-the-wisp" is one token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="adjective.compound" language="en"&gt;


> > > 

&lt;input&gt;

Let us visit the Museum of Afro-American History in Boston.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Let⁍ ⁌us⁍ ⁌visit⁍ ⁌the⁍ ⁌Museum⁍ ⁌of⁍ ⁌Afro-American⁍ ⁌History⁍ ⁌in⁍ ⁌Boston⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - compound is one token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="apostrophe.possessive" language="en"&gt;


> > > 

&lt;input&gt;

The next question is Debanjan's.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌next⁍ ⁌question⁍ ⁌is⁍ ⁌Debanjan⁍ ⁌'s⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - possessive marker is separate token

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌next⁍ ⁌question⁍ ⁌is⁍ ⁌Debanjan⁍ ⁌'⁍ ⁌s⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - possessive marker is split into two tokens

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌next⁍ ⁌question⁍ ⁌is⁍ ⁌Debanjan's⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - possessive marker is not split off

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="abbreviation.Ph\_d\_" language="en"&gt;


> > > 

&lt;source&gt;

http://tech.grammarly.com/blog/posts/How-to-Split-Sentences.html

&lt;/source&gt;


> > > 

&lt;input&gt;

At some schools, even professionals boasting Ph.D. degrees are coming back to school for Master's degrees.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌At⁍ ⁌some⁍ ⁌schools⁍ ⁌,⁍ ⁌even⁍ ⁌professionals⁍ ⁌boasting⁍ ⁌Ph.D⁍ ⁌.⁍ ⁌degrees⁍ ⁌are⁍ ⁌coming⁍ ⁌back⁍ ⁌to⁍ ⁌school⁍ ⁌for⁍ ⁌Master's⁍ ⁌degrees⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - last dot in abbreviation split off

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌At⁍ ⁌some⁍ ⁌schools⁍ ⁌,⁍ ⁌even⁍ ⁌professionals⁍ ⁌boasting⁍ ⁌Ph.D.⁍ ⁌degrees⁍ ⁌are⁍ ⁌coming⁍ ⁌back⁍ ⁌to⁍ ⁌school⁍ ⁌for⁍ ⁌Master⁍ ⁌'s⁍ ⁌degrees⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - abbreviation not split

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌At⁍ ⁌some⁍ ⁌schools⁍ ⁌,⁍ ⁌even⁍ ⁌professionals⁍ ⁌boasting⁍ ⁌Ph⁍ ⁌.⁍ ⁌D⁍ ⁌.⁍ ⁌degrees⁍ ⁌are⁍ ⁌coming⁍ ⁌back⁍ ⁌to⁍ ⁌school⁍ ⁌for⁍ ⁌Master⁍ ⁌'⁍ ⁌s⁍ ⁌degrees⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - overzealous split of abbreviation

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="spelling\_mistake.small\_after\_full\_stop" language="en"&gt;


> > > 

&lt;source&gt;

http://tech.grammarly.com/blog/posts/How-to-Split-Sentences.html

&lt;/source&gt;


> > > 

&lt;input&gt;

If Harvard doesn't come through, I 'll take the test to get into Yale. many parents set goals for their children, or maybe they don't set a goal.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌If⁍ ⁌Harvard⁍ ⁌doesn't⁍ ⁌come⁍ ⁌through⁍ ⁌,⁍ ⁌I⁍ ⁌'⁍ ⁌ll⁍ ⁌take⁍ ⁌the⁍ ⁌test⁍ ⁌to⁍ ⁌get⁍ ⁌into⁍ ⁌Yale⁍ ⁌.⁍ ⁌many⁍ ⁌parents⁍ ⁌set⁍ ⁌goals⁍ ⁌for⁍ ⁌their⁍ ⁌children⁍ ⁌,⁍ ⁌or⁍ ⁌maybe⁍ ⁌they⁍ ⁌don't⁍ ⁌set⁍ ⁌a⁍ ⁌goal⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - new sentence not detected

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌If⁍ ⁌Harvard⁍ ⁌does⁍ ⁌n't⁍ ⁌come⁍ ⁌through⁍ ⁌,⁍ ⁌I⁍ ⁌'ll⁍ ⁌take⁍ ⁌the⁍ ⁌test⁍ ⁌to⁍ ⁌get⁍ ⁌into⁍ ⁌Yale⁍ ⁌.⁍ ▶ ◀⁌many⁍ ⁌parents⁍ ⁌set⁍ ⁌goals⁍ ⁌for⁍ ⁌their⁍ ⁌children⁍ ⁌,⁍ ⁌or⁍ ⁌maybe⁍ ⁌they⁍ ⁌do⁍ ⁌n't⁍ ⁌set⁍ ⁌a⁍ ⁌goal⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - new sentence detected

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌If⁍ ⁌Harvard⁍ ⁌doesn⁍ ⁌'⁍ ⁌t⁍ ⁌come⁍ ⁌through⁍ ⁌,⁍ ⁌I⁍ ⁌'⁍ ⁌ll⁍ ⁌take⁍ ⁌the⁍ ⁌test⁍ ⁌to⁍ ⁌get⁍ ⁌into⁍ ⁌Yale⁍ ⁌.⁍ ▶ ◀⁌many⁍ ⁌parents⁍ ⁌set⁍ ⁌goals⁍ ⁌for⁍ ⁌their⁍ ⁌children⁍ ⁌,⁍ ⁌or⁍ ⁌maybe⁍ ⁌they⁍ ⁌don⁍ ⁌'⁍ ⁌t⁍ ⁌set⁍ ⁌a⁍ ⁌goal⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - new sentence detected

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="abbreviation.name\_after\_abbrev" language="en"&gt;


> > > 

&lt;source&gt;

http://tech.grammarly.com/blog/posts/How-to-Split-Sentences.html

&lt;/source&gt;


> > > 

&lt;input&gt;

He adds, in a far less amused tone, that the government has been talking about making Mt. Kuanyin a national park for a long time, and has banned construction or use of the mountain.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌He⁍ ⁌adds⁍ ⁌,⁍ ⁌in⁍ ⁌a⁍ ⁌far⁍ ⁌less⁍ ⁌amused⁍ ⁌tone⁍ ⁌,⁍ ⁌that⁍ ⁌the⁍ ⁌government⁍ ⁌has⁍ ⁌been⁍ ⁌talking⁍ ⁌about⁍ ⁌making⁍ ⁌Mt⁍ ⁌.⁍ ▶ ◀⁌Kuanyin⁍ ⁌a⁍ ⁌national⁍ ⁌park⁍ ⁌for⁍ ⁌a⁍ ⁌long⁍ ⁌time⁍ ⁌,⁍ ⁌and⁍ ⁌has⁍ ⁌banned⁍ ⁌construction⁍ ⁌or⁍ ⁌use⁍ ⁌of⁍ ⁌the⁍ ⁌mountain⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - abbreviation detected as sentence split

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌He⁍ ⁌adds⁍ ⁌,⁍ ⁌in⁍ ⁌a⁍ ⁌far⁍ ⁌less⁍ ⁌amused⁍ ⁌tone⁍ ⁌,⁍ ⁌that⁍ ⁌the⁍ ⁌government⁍ ⁌has⁍ ⁌been⁍ ⁌talking⁍ ⁌about⁍ ⁌making⁍ ⁌Mt⁍ ⁌.⁍ ▶ ◀⁌Kuanyin⁍ ⁌a⁍ ⁌national⁍ ⁌park⁍ ⁌for⁍ ⁌a⁍ ⁌long⁍ ⁌time⁍ ⁌,⁍ ⁌and⁍ ⁌has⁍ ⁌banned⁍ ⁌construction⁍ ⁌or⁍ ⁌use⁍ ⁌of⁍ ⁌the⁍ ⁌mountain⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - abbreviation detected as sentence split

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌He⁍ ⁌adds⁍ ⁌,⁍ ⁌in⁍ ⁌a⁍ ⁌far⁍ ⁌less⁍ ⁌amused⁍ ⁌tone⁍ ⁌,⁍ ⁌that⁍ ⁌the⁍ ⁌government⁍ ⁌has⁍ ⁌been⁍ ⁌talking⁍ ⁌about⁍ ⁌making⁍ ⁌Mt.⁍ ⁌Kuanyin⁍ ⁌a⁍ ⁌national⁍ ⁌park⁍ ⁌for⁍ ⁌a⁍ ⁌long⁍ ⁌time⁍ ⁌,⁍ ⁌and⁍ ⁌has⁍ ⁌banned⁍ ⁌construction⁍ ⁌or⁍ ⁌use⁍ ⁌of⁍ ⁌the⁍ ⁌mountain⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - abbreviation now detected as sentence split

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="abbreviation.name\_after\_abbrev\_2" language="en"&gt;


> > > 

&lt;source&gt;

http://tech.grammarly.com/blog/posts/How-to-Split-Sentences.html

&lt;/source&gt;


> > > 

&lt;input&gt;

The luxury auto maker last year sold 1,214 cars in the U.S. Howard Mosher, president and chief executive officer, said he anticipates growth for the luxury auto maker in Britain and Europe, and in Far Eastern markets.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌luxury⁍ ⁌auto⁍ ⁌maker⁍ ⁌last⁍ ⁌year⁍ ⁌sold⁍ ⁌1,214⁍ ⁌cars⁍ ⁌in⁍ ⁌the⁍ ⁌U.S⁍ ⁌.⁍ ▶ ◀⁌Howard⁍ ⁌Mosher⁍ ⁌,⁍ ⁌president⁍ ⁌and⁍ ⁌chief⁍ ⁌executive⁍ ⁌officer⁍ ⁌,⁍ ⁌said⁍ ⁌he⁍ ⁌anticipates⁍ ⁌growth⁍ ⁌for⁍ ⁌the⁍ ⁌luxury⁍ ⁌auto⁍ ⁌maker⁍ ⁌in⁍ ⁌Britain⁍ ⁌and⁍ ⁌Europe⁍ ⁌,⁍ ⁌and⁍ ⁌in⁍ ⁌Far⁍ ⁌Eastern⁍ ⁌markets⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - sentence split after abbreviation

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌luxury⁍ ⁌auto⁍ ⁌maker⁍ ⁌last⁍ ⁌year⁍ ⁌sold⁍ ⁌1,214⁍ ⁌cars⁍ ⁌in⁍ ⁌the⁍ ⁌U.S.⁍ ▶ ◀⁌Howard⁍ ⁌Mosher⁍ ⁌,⁍ ⁌president⁍ ⁌and⁍ ⁌chief⁍ ⁌executive⁍ ⁌officer⁍ ⁌,⁍ ⁌said⁍ ⁌he⁍ ⁌anticipates⁍ ⁌growth⁍ ⁌for⁍ ⁌the⁍ ⁌luxury⁍ ⁌auto⁍ ⁌maker⁍ ⁌in⁍ ⁌Britain⁍ ⁌and⁍ ⁌Europe⁍ ⁌,⁍ ⁌and⁍ ⁌in⁍ ⁌Far⁍ ⁌Eastern⁍ ⁌markets⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - sentence split after abbreviation

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌luxury⁍ ⁌auto⁍ ⁌maker⁍ ⁌last⁍ ⁌year⁍ ⁌sold⁍ ⁌1,214⁍ ⁌cars⁍ ⁌in⁍ ⁌the⁍ ⁌U.S.⁍ ⁌Howard⁍ ⁌Mosher⁍ ⁌,⁍ ⁌president⁍ ⁌and⁍ ⁌chief⁍ ⁌executive⁍ ⁌officer⁍ ⁌,⁍ ⁌said⁍ ⁌he⁍ ⁌anticipates⁍ ⁌growth⁍ ⁌for⁍ ⁌the⁍ ⁌luxury⁍ ⁌auto⁍ ⁌maker⁍ ⁌in⁍ ⁌Britain⁍ ⁌and⁍ ⁌Europe⁍ ⁌,⁍ ⁌and⁍ ⁌in⁍ ⁌Far⁍ ⁌Eastern⁍ ⁌markets⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence not split when ended by abbreviation followed by name

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌luxury⁍ ⁌auto⁍ ⁌maker⁍ ⁌last⁍ ⁌year⁍ ⁌sold⁍ ⁌1⁍ ⁌,⁍ ⁌214⁍ ⁌cars⁍ ⁌in⁍ ⁌the⁍ ⁌U⁍ ⁌.⁍ ⁌S⁍ ⁌.⁍ ⁌Howard⁍ ⁌Mosher⁍ ⁌,⁍ ⁌president⁍ ⁌and⁍ ⁌chief⁍ ⁌executive⁍ ⁌officer⁍ ⁌,⁍ ⁌said⁍ ⁌he⁍ ⁌anticipates⁍ ⁌growth⁍ ⁌for⁍ ⁌the⁍ ⁌luxury⁍ ⁌auto⁍ ⁌maker⁍ ⁌in⁍ ⁌Britain⁍ ⁌and⁍ ⁌Europe⁍ ⁌,⁍ ⁌and⁍ ⁌in⁍ ⁌Far⁍ ⁌Eastern⁍ ⁌markets⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence not split when ended by abbreviation followed by name

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="ellipsis.simple" language="en"&gt;


> > > 

&lt;source&gt;

http://tech.grammarly.com/blog/posts/How-to-Split-Sentences.html

&lt;/source&gt;


> > > 

&lt;input&gt;

No, to my mind, the Journal did not "defend sleaze, fraud, waste, embezzlement, influence-peddling and abuse of the public trust..." it defended appropriate constitutional safeguards and practical common sense.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌No⁍ ⁌,⁍ ⁌to⁍ ⁌my⁍ ⁌mind⁍ ⁌,⁍ ⁌the⁍ ⁌Journal⁍ ⁌did⁍ ⁌not⁍ ⁌"⁍ ⁌defend⁍ ⁌sleaze⁍ ⁌,⁍ ⁌fraud⁍ ⁌,⁍ ⁌waste⁍ ⁌,⁍ ⁌embezzlement⁍ ⁌,⁍ ⁌influence-peddling⁍ ⁌and⁍ ⁌abuse⁍ ⁌of⁍ ⁌the⁍ ⁌public⁍ ⁌trust⁍ ⁌.⁍ ⁌.⁍ ⁌.⁍ ⁌"⁍ ⁌it⁍ ⁌defended⁍ ⁌appropriate⁍ ⁌constitutional⁍ ⁌safeguards⁍ ⁌and⁍ ⁌practical⁍ ⁌common⁍ ⁌sense⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - ellipsis split

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌No,⁍ ⁌to⁍ ⁌my⁍ ⁌mind⁍ ⁌,⁍ ⁌the⁍ ⁌Journal⁍ ⁌did⁍ ⁌not⁍ ⁌"defend⁍ ⁌sleaze⁍ ⁌,⁍ ⁌fraud⁍ ⁌,⁍ ⁌waste⁍ ⁌,⁍ ⁌embezzlement⁍ ⁌,⁍ ⁌influence-peddling⁍ ⁌and⁍ ⁌abuse⁍ ⁌of⁍ ⁌the⁍ ⁌public⁍ ⁌trust⁍ ⁌..⁍ ⁌.⁍ ⁌"⁍ ⁌it⁍ ⁌defended⁍ ⁌appropriate⁍ ⁌constitutional⁍ ⁌safeguards⁍ ⁌and⁍ ⁌practical⁍ ⁌common⁍ ⁌sense⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - ellipsis split

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌No⁍ ⁌,⁍ ⁌to⁍ ⁌my⁍ ⁌mind⁍ ⁌,⁍ ⁌the⁍ ⁌Journal⁍ ⁌did⁍ ⁌not⁍ ⁌"⁍ ⁌defend⁍ ⁌sleaze⁍ ⁌,⁍ ⁌fraud⁍ ⁌,⁍ ⁌waste⁍ ⁌,⁍ ⁌embezzlement⁍ ⁌,⁍ ⁌influence-peddling⁍ ⁌and⁍ ⁌abuse⁍ ⁌of⁍ ⁌the⁍ ⁌public⁍ ⁌trust⁍ ⁌...⁍ ⁌"⁍ ⁌it⁍ ⁌defended⁍ ⁌appropriate⁍ ⁌constitutional⁍ ⁌safeguards⁍ ⁌and⁍ ⁌practical⁍ ⁌common⁍ ⁌sense⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - ellipsis not split

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌No⁍ ⁌,⁍ ⁌to⁍ ⁌my⁍ ⁌mind⁍ ⁌,⁍ ⁌the⁍ ⁌Journal⁍ ⁌did⁍ ⁌not⁍ ⁌"⁍ ⁌defend⁍ ⁌sleaze⁍ ⁌,⁍ ⁌fraud⁍ ⁌,⁍ ⁌waste⁍ ⁌,⁍ ⁌embezzlement⁍ ⁌,⁍ ⁌influence-peddling⁍ ⁌and⁍ ⁌abuse⁍ ⁌of⁍ ⁌the⁍ ⁌public⁍ ⁌trust⁍ ⁌.⁍ ⁌.⁍ ⁌.⁍ ⁌"⁍ ⁌it⁍ ⁌defended⁍ ⁌appropriate⁍ ⁌constitutional⁍ ⁌safeguards⁍ ⁌and⁍ ⁌practical⁍ ⁌common⁍ ⁌sense⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - ellipsis split

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="ellipsis.2" language="en"&gt;


> > > 

&lt;source&gt;

http://tech.grammarly.com/blog/posts/How-to-Split-Sentences.html

&lt;/source&gt;


> > > 

&lt;input&gt;

After seeing the list of what would not be open and/or on duty... which I'm also quite sure is not complete... I 'll go out on a limb.... and predict... that this will not happen.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌After⁍ ⁌seeing⁍ ⁌the⁍ ⁌list⁍ ⁌of⁍ ⁌what⁍ ⁌would⁍ ⁌not⁍ ⁌be⁍ ⁌open⁍ ⁌and⁍ ⁌/⁍ ⁌or⁍ ⁌on⁍ ⁌duty⁍ ⁌.⁍ ⁌.⁍ ⁌.⁍ ⁌which⁍ ⁌I'm⁍ ⁌also⁍ ⁌quite⁍ ⁌sure⁍ ⁌is⁍ ⁌not⁍ ⁌complete⁍ ⁌.⁍ ⁌.⁍ ⁌.⁍ ▶ ◀⁌I⁍ ⁌'⁍ ⁌ll⁍ ⁌go⁍ ⁌out⁍ ⁌on⁍ ⁌a⁍ ⁌limb⁍ ⁌.⁍ ⁌.⁍ ⁌.⁍ ⁌.⁍ ⁌and⁍ ⁌predict⁍ ⁌.⁍ ⁌.⁍ ⁌.⁍ ⁌that⁍ ⁌this⁍ ⁌will⁍ ⁌not⁍ ⁌happen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - overzealous splitting

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌After⁍ ⁌seeing⁍ ⁌the⁍ ⁌list⁍ ⁌of⁍ ⁌what⁍ ⁌would⁍ ⁌not⁍ ⁌be⁍ ⁌open⁍ ⁌and/or⁍ ⁌on⁍ ⁌duty⁍ ⁌...⁍ ⁌which⁍ ⁌I⁍ ⁌'m⁍ ⁌also⁍ ⁌quite⁍ ⁌sure⁍ ⁌is⁍ ⁌not⁍ ⁌complete⁍ ⁌...⁍ ⁌I⁍ ⁌'ll⁍ ⁌go⁍ ⁌out⁍ ⁌on⁍ ⁌a⁍ ⁌limb⁍ ⁌....⁍ ⁌and⁍ ⁌predict⁍ ⁌...⁍ ⁌that⁍ ⁌this⁍ ⁌will⁍ ⁌not⁍ ⁌happen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - no ellipsis or sentence splitting

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌After⁍ ⁌seeing⁍ ⁌the⁍ ⁌list⁍ ⁌of⁍ ⁌what⁍ ⁌would⁍ ⁌not⁍ ⁌be⁍ ⁌open⁍ ⁌and/or⁍ ⁌on⁍ ⁌duty⁍ ⁌...⁍ ⁌which⁍ ⁌I⁍ ⁌'m⁍ ⁌also⁍ ⁌quite⁍ ⁌sure⁍ ⁌is⁍ ⁌not⁍ ⁌complete⁍ ⁌...⁍ ▶ ◀⁌I⁍ ⁌'ll⁍ ⁌go⁍ ⁌out⁍ ⁌on⁍ ⁌a⁍ ⁌limb....⁍ ⁌and⁍ ⁌predict⁍ ⁌...⁍ ⁌that⁍ ⁌this⁍ ⁌will⁍ ⁌not⁍ ⁌happen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - split after ellipsis before "I'm"

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌After⁍ ⁌seeing⁍ ⁌the⁍ ⁌list⁍ ⁌of⁍ ⁌what⁍ ⁌would⁍ ⁌not⁍ ⁌be⁍ ⁌open⁍ ⁌and⁍ ⁌/⁍ ⁌or⁍ ⁌on⁍ ⁌duty⁍ ⁌.⁍ ⁌.⁍ ⁌.⁍ ⁌which⁍ ⁌I⁍ ⁌'⁍ ⁌m⁍ ⁌also⁍ ⁌quite⁍ ⁌sure⁍ ⁌is⁍ ⁌not⁍ ⁌complete⁍ ⁌.⁍ ⁌.⁍ ⁌.⁍ ▶ ◀⁌I⁍ ⁌'⁍ ⁌ll⁍ ⁌go⁍ ⁌out⁍ ⁌on⁍ ⁌a⁍ ⁌limb⁍ ⁌.⁍ ⁌.⁍ ⁌.⁍ ⁌.⁍ ⁌and⁍ ⁌predict⁍ ⁌.⁍ ⁌.⁍ ⁌.⁍ ⁌that⁍ ⁌this⁍ ⁌will⁍ ⁌not⁍ ⁌happen⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - overzealous splitting

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="initials" language="en"&gt;


> > > 

&lt;source&gt;

http://tech.grammarly.com/blog/posts/How-to-Split-Sentences.html

&lt;/source&gt;


> > > 

&lt;input&gt;

Bharat Ratna Avul Pakir Jainulabdeen Abdul Kalam is also called as Dr. A.P.J Abdul Kalam.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Bharat⁍ ⁌Ratna⁍ ⁌Avul⁍ ⁌Pakir⁍ ⁌Jainulabdeen⁍ ⁌Abdul⁍ ⁌Kalam⁍ ⁌is⁍ ⁌also⁍ ⁌called⁍ ⁌as⁍ ⁌Dr⁍ ⁌.⁍ ▶ ◀⁌A.P.J⁍ ⁌Abdul⁍ ⁌Kalam⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence split after abbreviation

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Bharat⁍ ⁌Ratna⁍ ⁌Avul⁍ ⁌Pakir⁍ ⁌Jainulabdeen⁍ ⁌Abdul⁍ ⁌Kalam⁍ ⁌is⁍ ⁌also⁍ ⁌called⁍ ⁌as⁍ ⁌Dr⁍ ⁌.⁍ ⁌A⁍ ⁌.⁍ ⁌P⁍ ⁌.⁍ ▶ ◀⁌J⁍ ⁌Abdul⁍ ⁌Kalam⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - overzealous splitting

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Bharat⁍ ⁌Ratna⁍ ⁌Avul⁍ ⁌Pakir⁍ ⁌Jainulabdeen⁍ ⁌Abdul⁍ ⁌Kalam⁍ ⁌is⁍ ⁌also⁍ ⁌called⁍ ⁌as⁍ ⁌Dr.⁍ ⁌A.P.J⁍ ⁌Abdul⁍ ⁌Kalam⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - sentence not split after abbreviation

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="initials.lookalike" language="en"&gt;


> > > 

&lt;source&gt;

http://tech.grammarly.com/blog/posts/How-to-Split-Sentences.html

&lt;/source&gt;


> > > 

&lt;input&gt;

The agency said it confirmed American Continental's preferred stock rating at C. American Continental's thrift unit, Los Angeles-based Lincoln Savings &amp; Loan Association, is in receivership and the parent company has filed for protection from creditor lawsuits under Chapter 11 of the federal Bankruptcy Code.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌agency⁍ ⁌said⁍ ⁌it⁍ ⁌confirmed⁍ ⁌American⁍ ⁌Continental's⁍ ⁌preferred⁍ ⁌stock⁍ ⁌rating⁍ ⁌at⁍ ⁌C⁍ ⁌.⁍ ▶ ◀⁌American⁍ ⁌Continental's⁍ ⁌thrift⁍ ⁌unit⁍ ⁌,⁍ ⁌Los⁍ ⁌Angeles-based⁍ ⁌Lincoln⁍ ⁌Savings⁍ ⁌&amp;⁍ ⁌Loan⁍ ⁌Association⁍ ⁌,⁍ ⁌is⁍ ⁌in⁍ ⁌receivership⁍ ⁌and⁍ ⁌the⁍ ⁌parent⁍ ⁌company⁍ ⁌has⁍ ⁌filed⁍ ⁌for⁍ ⁌protection⁍ ⁌from⁍ ⁌creditor⁍ ⁌lawsuits⁍ ⁌under⁍ ⁌Chapter⁍ ⁌11⁍ ⁌of⁍ ⁌the⁍ ⁌federal⁍ ⁌Bankruptcy⁍ ⁌Code⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - sentence split after initial-lookalike

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌agency⁍ ⁌said⁍ ⁌it⁍ ⁌confirmed⁍ ⁌American⁍ ⁌Continental⁍ ⁌'s⁍ ⁌preferred⁍ ⁌stock⁍ ⁌rating⁍ ⁌at⁍ ⁌C.⁍ ⁌American⁍ ⁌Continental⁍ ⁌'s⁍ ⁌thrift⁍ ⁌unit⁍ ⁌,⁍ ⁌Los⁍ ⁌Angeles-based⁍ ⁌Lincoln⁍ ⁌Savings⁍ ⁌&amp;⁍ ⁌Loan⁍ ⁌Association⁍ ⁌,⁍ ⁌is⁍ ⁌in⁍ ⁌receivership⁍ ⁌and⁍ ⁌the⁍ ⁌parent⁍ ⁌company⁍ ⁌has⁍ ⁌filed⁍ ⁌for⁍ ⁌protection⁍ ⁌from⁍ ⁌creditor⁍ ⁌lawsuits⁍ ⁌under⁍ ⁌Chapter⁍ ⁌11⁍ ⁌of⁍ ⁌the⁍ ⁌federal⁍ ⁌Bankruptcy⁍ ⁌Code⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence not split after initial-lookalike

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌agency⁍ ⁌said⁍ ⁌it⁍ ⁌confirmed⁍ ⁌American⁍ ⁌Continental⁍ ⁌'⁍ ⁌s⁍ ⁌preferred⁍ ⁌stock⁍ ⁌rating⁍ ⁌at⁍ ⁌C⁍ ⁌.⁍ ⁌American⁍ ⁌Continental⁍ ⁌'⁍ ⁌s⁍ ⁌thrift⁍ ⁌unit⁍ ⁌,⁍ ⁌Los⁍ ⁌Angeles-based⁍ ⁌Lincoln⁍ ⁌Savings⁍ ⁌&amp;⁍ ⁌Loan⁍ ⁌Association⁍ ⁌,⁍ ⁌is⁍ ⁌in⁍ ⁌receivership⁍ ⁌and⁍ ⁌the⁍ ⁌parent⁍ ⁌company⁍ ⁌has⁍ ⁌filed⁍ ⁌for⁍ ⁌protection⁍ ⁌from⁍ ⁌creditor⁍ ⁌lawsuits⁍ ⁌under⁍ ⁌Chapter⁍ ⁌11⁍ ⁌of⁍ ⁌the⁍ ⁌federal⁍ ⁌Bankruptcy⁍ ⁌Code⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence not split after initial-lookalike and overzealous splitting

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="directspeech.question" language="en"&gt;


> > > 

&lt;source&gt;

http://tech.grammarly.com/blog/posts/How-to-Split-Sentences.html

&lt;/source&gt;


> > > 

&lt;input&gt;

Wang first asked: "Are you sure you want the original inscription ground off?" Without thinking twice about it, Huang said yes.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Wang⁍ ⁌first⁍ ⁌asked⁍ ⁌:⁍ ⁌"⁍ ⁌Are⁍ ⁌you⁍ ⁌sure⁍ ⁌you⁍ ⁌want⁍ ⁌the⁍ ⁌original⁍ ⁌inscription⁍ ⁌ground⁍ ⁌off⁍ ⁌?⁍ ⁌"⁍ ▶ ◀⁌Without⁍ ⁌thinking⁍ ⁌twice⁍ ⁌about⁍ ⁌it⁍ ⁌,⁍ ⁌Huang⁍ ⁌said⁍ ⁌yes⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - sentence split after direct speech

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Wang⁍ ⁌first⁍ ⁌asked⁍ ⁌:⁍ ⁌"⁍ ⁌Are⁍ ⁌you⁍ ⁌sure⁍ ⁌you⁍ ⁌want⁍ ⁌the⁍ ⁌original⁍ ⁌inscription⁍ ⁌ground⁍ ⁌off⁍ ⁌?⁍ ⁌"⁍ ⁌Without⁍ ⁌thinking⁍ ⁌twice⁍ ⁌about⁍ ⁌it⁍ ⁌,⁍ ⁌Huang⁍ ⁌said⁍ ⁌yes⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence not split after direct speech

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="directspeech.apostrophes" language="en"&gt;


> > > 

&lt;source&gt;

http://tech.grammarly.com/blog/posts/How-to-Split-Sentences.html

&lt;/source&gt;


> > > 

&lt;input&gt;

"It's too much, there's only us two, how are we going to eat this?" I asked young Zhao as I looked at him in surprise.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌"⁍ ⁌It's⁍ ⁌too⁍ ⁌much⁍ ⁌,⁍ ⁌there's⁍ ⁌only⁍ ⁌us⁍ ⁌two⁍ ⁌,⁍ ⁌how⁍ ⁌are⁍ ⁌we⁍ ⁌going⁍ ⁌to⁍ ⁌eat⁍ ⁌this⁍ ⁌?⁍ ⁌"⁍ ▶ ◀⁌I⁍ ⁌asked⁍ ⁌young⁍ ⁌Zhao⁍ ⁌as⁍ ⁌I⁍ ⁌looked⁍ ⁌at⁍ ⁌him⁍ ⁌in⁍ ⁌surprise⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence split after direct speech end but before sentence end

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌"⁍ ⁌It⁍ ⁌'s⁍ ⁌too⁍ ⁌much⁍ ⁌,⁍ ⁌there⁍ ⁌'s⁍ ⁌only⁍ ⁌us⁍ ⁌two⁍ ⁌,⁍ ⁌how⁍ ⁌are⁍ ⁌we⁍ ⁌going⁍ ⁌to⁍ ⁌eat⁍ ⁌this⁍ ⁌?⁍ ⁌"⁍ ▶ ◀⁌I⁍ ⁌asked⁍ ⁌young⁍ ⁌Zhao⁍ ⁌as⁍ ⁌I⁍ ⁌looked⁍ ⁌at⁍ ⁌him⁍ ⁌in⁍ ⁌surprise⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence split after direct speech end but before sentence end

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌"⁍ ⁌It⁍ ⁌'⁍ ⁌s⁍ ⁌too⁍ ⁌much⁍ ⁌,⁍ ⁌there⁍ ⁌'⁍ ⁌s⁍ ⁌only⁍ ⁌us⁍ ⁌two⁍ ⁌,⁍ ⁌how⁍ ⁌are⁍ ⁌we⁍ ⁌going⁍ ⁌to⁍ ⁌eat⁍ ⁌this⁍ ⁌?⁍ ⁌"⁍ ▶ ◀⁌I⁍ ⁌asked⁍ ⁌young⁍ ⁌Zhao⁍ ⁌as⁍ ⁌I⁍ ⁌looked⁍ ⁌at⁍ ⁌him⁍ ⁌in⁍ ⁌surprise⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence split after direct speech end but before sentence end

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="sentence.non\_standard\_end" language="en"&gt;


> > > 

&lt;source&gt;

http://tech.grammarly.com/blog/posts/How-to-Split-Sentences.html

&lt;/source&gt;


> > > 

&lt;input&gt;

The JW considers itself THE kingdom of God on earth. ('Kindom Hall') So it is only to be expected that they do not see a reason to run to and report everything to the government.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌JW⁍ ⁌considers⁍ ⁌itself⁍ ⁌THE⁍ ⁌kingdom⁍ ⁌of⁍ ⁌God⁍ ⁌on⁍ ⁌earth⁍ ⁌.⁍ ▶ ◀⁌(⁍ ⁌'⁍ ⁌Kindom⁍ ⁌Hall⁍ ⁌'⁍ ⁌)⁍ ⁌So⁍ ⁌it⁍ ⁌is⁍ ⁌only⁍ ⁌to⁍ ⁌be⁍ ⁌expected⁍ ⁌that⁍ ⁌they⁍ ⁌do⁍ ⁌not⁍ ⁌see⁍ ⁌a⁍ ⁌reason⁍ ⁌to⁍ ⁌run⁍ ⁌to⁍ ⁌and⁍ ⁌report⁍ ⁌everything⁍ ⁌to⁍ ⁌the⁍ ⁌government⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence split before non-standard end

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌JW⁍ ⁌considers⁍ ⁌itself⁍ ⁌THE⁍ ⁌kingdom⁍ ⁌of⁍ ⁌God⁍ ⁌on⁍ ⁌earth⁍ ⁌.⁍ ▶ ◀⁌(⁍ ⁌'Kindom⁍ ⁌Hall⁍ ⁌'⁍ ⁌)⁍ ⁌So⁍ ⁌it⁍ ⁌is⁍ ⁌only⁍ ⁌to⁍ ⁌be⁍ ⁌expected⁍ ⁌that⁍ ⁌they⁍ ⁌do⁍ ⁌not⁍ ⁌see⁍ ⁌a⁍ ⁌reason⁍ ⁌to⁍ ⁌run⁍ ⁌to⁍ ⁌and⁍ ⁌report⁍ ⁌everything⁍ ⁌to⁍ ⁌the⁍ ⁌government⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence split before non-standard end

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌The⁍ ⁌JW⁍ ⁌considers⁍ ⁌itself⁍ ⁌THE⁍ ⁌kingdom⁍ ⁌of⁍ ⁌God⁍ ⁌on⁍ ⁌earth⁍ ⁌.⁍ ▶ ◀⁌(⁍ ⁌'⁍ ⁌Kindom⁍ ⁌Hall⁍ ⁌'⁍ ⁌)⁍ ⁌So⁍ ⁌it⁍ ⁌is⁍ ⁌only⁍ ⁌to⁍ ⁌be⁍ ⁌expected⁍ ⁌that⁍ ⁌they⁍ ⁌do⁍ ⁌not⁍ ⁌see⁍ ⁌a⁍ ⁌reason⁍ ⁌to⁍ ⁌run⁍ ⁌to⁍ ⁌and⁍ ⁌report⁍ ⁌everything⁍ ⁌to⁍ ⁌the⁍ ⁌government⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - sentence split before non-standard end

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;


> > 

&lt;test id="url" language="en"&gt;


> > > 

&lt;source&gt;

http://tech.grammarly.com/blog/posts/How-to-Split-Sentences.html

&lt;/source&gt;


> > > 

&lt;input&gt;

Everyone please note my blog on Donews http://blog.donews.com/pangshengdong. What I say is not necessarily right, but I am confident that if you read it carefully it should give you a start.

&lt;/input&gt;


> > > 

&lt;possibleOutputs&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Everyone⁍ ⁌please⁍ ⁌note⁍ ⁌my⁍ ⁌blog⁍ ⁌on⁍ ⁌Donews⁍ ⁌http⁍ ⁌:⁍ ⁌/⁍ ⁌/⁍ ⁌blog.donews.com⁍ ⁌/⁍ ⁌pangshengdong⁍ ⁌.⁍ ▶ ◀⁌What⁍ ⁌I⁍ ⁌say⁍ ⁌is⁍ ⁌not⁍ ⁌necessarily⁍ ⁌right⁍ ⁌,⁍ ⁌but⁍ ⁌I⁍ ⁌am⁍ ⁌confident⁍ ⁌that⁍ ⁌if⁍ ⁌you⁍ ⁌read⁍ ⁌it⁍ ⁌carefully⁍ ⁌it⁍ ⁌should⁍ ⁌give⁍ ⁌you⁍ ⁌a⁍ ⁌start⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - URL split into pieces

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Everyone⁍ ⁌please⁍ ⁌note⁍ ⁌my⁍ ⁌blog⁍ ⁌on⁍ ⁌Donews⁍ ⁌http://blog.donews.com/pangshengdong⁍ ⁌.⁍ ▶ ◀⁌What⁍ ⁌I⁍ ⁌say⁍ ⁌is⁍ ⁌not⁍ ⁌necessarily⁍ ⁌right⁍ ⁌,⁍ ⁌but⁍ ⁌I⁍ ⁌am⁍ ⁌confident⁍ ⁌that⁍ ⁌if⁍ ⁌you⁍ ⁌read⁍ ⁌it⁍ ⁌carefully⁍ ⁌it⁍ ⁌should⁍ ⁌give⁍ ⁌you⁍ ⁌a⁍ ⁌start⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

GOOD - URL remains one piece and full stop splits sentence

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;


> > > > 

&lt;possibleOutput&gt;


> > > > > 

&lt;output&gt;

◀⁌Everyone⁍ ⁌please⁍ ⁌note⁍ ⁌my⁍ ⁌blog⁍ ⁌on⁍ ⁌Donews⁍ ⁌http⁍ ⁌://blog.donews.com/pangshengdong⁍ ⁌.⁍ ▶ ◀⁌What⁍ ⁌I⁍ ⁌say⁍ ⁌is⁍ ⁌not⁍ ⁌necessarily⁍ ⁌right⁍ ⁌,⁍ ⁌but⁍ ⁌I⁍ ⁌am⁍ ⁌confident⁍ ⁌that⁍ ⁌if⁍ ⁌you⁍ ⁌read⁍ ⁌it⁍ ⁌carefully⁍ ⁌it⁍ ⁌should⁍ ⁌give⁍ ⁌you⁍ ⁌a⁍ ⁌start⁍ ⁌.⁍ ▶

&lt;/output&gt;


> > > > > 

&lt;description&gt;

BAD - URL protocol split off

&lt;/description&gt;



> > > > 

&lt;/possibleOutput&gt;



> > > 

&lt;/possibleOutputs&gt;



> > 

&lt;/test&gt;



> 

&lt;/tests&gt;




&lt;/testSuite&gt;

