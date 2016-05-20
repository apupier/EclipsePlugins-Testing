# advantages:

*   All in the same plugin
*   Easier to maintain
*   Less build time
*   InifiniTest and MoreUnit built-in integration

# drawbacks:


*   Requires optional dependencies for test bundles (JUnit, Mockito, AssertJ, your own test util framework and more)
*   Not clean, Runtime and test dependencies are mixed

# When to use it:

*   You are developing an RCP applications with no external contributor

# When not to use it:

*   You are providing a public API
*   Have a clear separation between Runtime and test dependencies

