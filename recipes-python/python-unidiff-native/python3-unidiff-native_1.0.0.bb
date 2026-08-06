SUMMARY = "Unified diff parsing/metadata extraction library"
HOMEPAGE = "https://github.com/matiasb/python-unidiff"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c434b08ef42fea235bb019b5e5a97b3"

PYPI_PACKAGE = "unidiff"

SRC_URI[md5sum] = "22a472a2102cf5b2d243ecad215342d6"
SRC_URI[sha256sum] = "5e5d5cfab2dc98be819b74747ab7d9f5af8695369ec8710b93f9ab0f0ae6a449"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
