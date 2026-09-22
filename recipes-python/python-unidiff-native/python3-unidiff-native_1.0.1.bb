SUMMARY = "Unified diff parsing/metadata extraction library"
HOMEPAGE = "https://github.com/matiasb/python-unidiff"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c434b08ef42fea235bb019b5e5a97b3"

PYPI_PACKAGE = "unidiff"

SRC_URI[md5sum] = "f24372292a7b3a46492d1d595628d243"
SRC_URI[sha256sum] = "d9425bc516390c54743a1045b2c1c97f02d245a913a241dd499f958adb2df998"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
