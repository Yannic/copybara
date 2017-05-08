import static com.google.copybara.git.GitTestUtil.getGitEnv;
    return new GitRepository(path, /*workTree=*/null, /*verbose=*/true, getGitEnv());
        firstCommitWriter(),
        firstCommitWriter(),
        firstCommitWriter(),
        newWriter(),
        firstCommitWriter(),
    process(firstCommitWriter(), ref);
    process(newWriter(), ref);
        newWriter(),
        newWriter(),
        firstCommitWriter(),
        newWriter(),
        newWriter(),
    Writer writer1 = destinationFirstCommit().newWriter(firstGlob, /*dryRun=*/false);
    Writer writer2 = destination().newWriter(Glob.createGlob(ImmutableList.of("baz/**")),
        /*dryRun=*/false);
    assertThat(destination().newWriter(firstGlob, /*dryRun=*/false)
        firstCommitWriter();
    writer = newWriter();
    writer = newWriter();
        firstCommitWriter(),
        newWriter()
    return newWriter()
        firstCommitWriter(),
        newWriter(),
        firstCommitWriter(),
        firstCommitWriter(),
        newWriter(),
        firstCommitWriter(),
        newWriter(),
        firstCommitWriter(),
        firstCommitWriter(),
        firstCommitWriter(),
        newWriter(),
        newWriter(),
    process(firstCommitWriter(), ref);
    process(newWriter(), ref);
        newWriter(), ref, firstCommit);
    process(firstCommitWriter(), ref);
    process(newWriter(), ref);
        newWriter(), ref, firstCommit);
    process(firstCommitWriter(), ref);
    process(newWriter(), ref);
        newWriter(), ref, firstCommit);
        firstCommitWriter();
    process(firstCommitWriter(), ref);
    process(newWriter(), ref);
  @Test
  public void testDryRun() throws Exception {
    fetch = "master";
    push = "master";

    Files.write(workdir.resolve("test.txt"), "some content".getBytes());

    Path scratchTree = Files.createTempDirectory("GitDestinationTest-testLocalRepo");
    Files.write(scratchTree.resolve("foo"), "foo\n".getBytes(UTF_8));
    repo().withWorkTree(scratchTree).add().force().files("foo").run();
    repo().withWorkTree(scratchTree).simpleCommand("commit", "-a", "-m", "change");

    Writer writer = destination().newWriter(destinationFiles, /*dryRun=*/ true);
    process(writer, new DummyRevision("origin_ref1"));

    GitTesting.assertThatCheckout(repo(), "master")
        .containsFile("foo", "foo\n")
        .containsNoMoreFiles();

    // Run again without dry run
    writer = destination().newWriter(destinationFiles, /*dryRun=*/ false);
    process(writer, new DummyRevision("origin_ref1"));

    GitTesting.assertThatCheckout(repo(), "master")
        .containsFile("test.txt", "some content")
        .containsNoMoreFiles();
  }

    Writer writer = newWriter();
        getGitEnv());
    Writer writer = firstCommitWriter();
        firstCommitWriter(), ref1);
    process(newWriter(), ref2);

  private Writer newWriter() throws ValidationException {
    return destination().newWriter(destinationFiles, /*dryRun=*/ false);
  }

  private Writer firstCommitWriter() throws ValidationException {
    return destinationFirstCommit().newWriter(destinationFiles, /*dryRun=*/ false);
  }