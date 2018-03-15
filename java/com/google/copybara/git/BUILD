# Copyright 2018 Google Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

licenses(["notice"])  # Apache 2.0

package(default_visibility = ["//visibility:public"])

# TODO(malcon): This package should be moved to the parent directory.
# But the refactor would be too big for the current change.

JAVACOPTS = [
    "-Xlint:unchecked",
    "-source",
    "1.8",
]

CORE = [
    "FetchResult.java",
    "GitCredential.java",
    "GitRepository.java",
    "GitRevision.java",
    "InvalidRefspecException.java",
    "RebaseConflictException.java",
    "Refspec.java",
]

java_library(
    name = "git",
    srcs = glob(
        ["**/*.java"],
        exclude = CORE + ["GitExecPath.java"],
    ),
    javacopts = JAVACOPTS,
    deps = [
        ":core",
        ":exec_path",
        "//java/com/google/copybara:base",
        "//java/com/google/copybara:general_options",
        "//java/com/google/copybara/authoring",
        "//java/com/google/copybara/config:base",
        "//java/com/google/copybara/config:global_migrations",
        "//java/com/google/copybara/doc:annotations",
        "//java/com/google/copybara/exception",
        "//java/com/google/copybara/git/github:api",
        "//java/com/google/copybara/git/github:util",
        "//java/com/google/copybara/jcommander:validators",
        "//java/com/google/copybara/monitor",
        "//java/com/google/copybara/profiler",
        "//java/com/google/copybara/util",
        "//java/com/google/copybara/util/console",
        "//third_party:google_http_client",
        "//third_party:guava",
        "//third_party:jcommander",
        "//third_party:jsr305",
        "//third_party:re2j",
        "//third_party:shell",
        "//third_party:skylark-lang",
    ],
)

java_library(
    name = "core",
    srcs = CORE,
    javacopts = JAVACOPTS,
    deps = [
        ":exec_path",
        "//java/com/google/copybara:base",
        "//java/com/google/copybara/authoring",
        "//java/com/google/copybara/exception",
        "//java/com/google/copybara/util",
        "//third_party:guava",
        "//third_party:jsr305",
        "//third_party:re2j",
        "//third_party:shell",
    ],
)

java_library(
    name = "exec_path",
    srcs = ["GitExecPath.java"],
    javacopts = JAVACOPTS,
    deps = [
        "//third_party:jsr305",
    ],
)